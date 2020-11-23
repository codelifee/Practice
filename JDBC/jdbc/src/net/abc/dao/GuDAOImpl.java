package net.abc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.abc.vo.GuVO;

public class GuDAOImpl {

	String driver="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user="week7";
	String pwd="week7";
	
	Connection con=null;
	PreparedStatement pt=null;
	ResultSet rs=null;
	String sql=null;
	
	public GuDAOImpl() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<GuVO> getGuList() {
		List<GuVO> glist=new ArrayList<>();
		
		try {
			sql="select * from gu order by g_no desc";
			pt=con.prepareStatement(sql);
			rs=pt.executeQuery();
			
			while(rs.next()) {
				GuVO g=new GuVO();
				g.setG_no(rs.getInt("g_no"));
				g.setG_title(rs.getString("g_title"));
				g.setG_hit(rs.getInt("g_hit"));
				g.setG_date(rs.getString("g_date"));
				g.setG_name(rs.getString("g_name"));
				
				glist.add(g);
			}
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(con != null) con.close();
				if(pt != null) pt.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		return glist;
	}

	public GuVO findNo(int no) {
		GuVO g=null;
		
		try {
			sql="select g_no from gu where g_no=?";
			pt=con.prepareStatement(sql);
			pt.setInt(1, no);
			rs=pt.executeQuery();
			if(rs.next()) {
				g=new GuVO();
				g.setG_no(rs.getInt("g_no"));
			}
			
			
		}catch(Exception e) {
			
		}finally {
			try {
				if(rs != null) rs.close();
				if(con != null) con.close();
				if(pt != null) pt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return g;
	}

	public int delGu(int no) {
		int re=-1;
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql="delete from gu where G_NO = ?";
			pt=con.prepareStatement(sql);
			pt.setInt(1, no);
			re = pt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(con != null) con.close();
				if(pt != null) pt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}
}
