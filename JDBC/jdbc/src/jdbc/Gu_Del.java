package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Gu_Del {
	public static void main(String[] args) {
		
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="week7";
		String pwd="week7";
		
		Connection con=null;
		PreparedStatement pt=null;
		ResultSet rs=null;
		String sql=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pwd);
			Scanner scan=new Scanner(System.in);
			System.out.println("type a number: ");
			int no=Integer.parseInt(scan.nextLine());
			sql="select g_no from gu where g_no=?";
			pt=con.prepareStatement(sql);
			pt.setInt(1, no);
			rs=pt.executeQuery();
			
			if(rs.next()) {
				sql="delete from gu where g_no=?";
				pt=con.prepareStatement(sql);
				pt.setInt(1, no);
				int re=pt.executeUpdate();
				if(re==1) {
					System.out.println("Successful");
				}
				
			} else {
				System.out.println("There is no satisfied number");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
