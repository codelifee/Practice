package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Gu_List {
	public static void main(String[] args) {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String user="week7";
		String pwd="week7";
		
		Connection con=null;
		PreparedStatement pt=null;
		ResultSet rs=null;
		String sql=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pwd);
			
			sql="select * from gu order by g_no desc";
			pt=con.prepareStatement(sql);
			rs=pt.executeQuery();
			
			System.out.println("no \t title \t name \t hit \t date");
			System.out.println("==================================");
			while(rs.next()) {
				System.out.println();
				int no=rs.getInt(1);
				
				String title=rs.getString("g_title");
				String name=rs.getString("g_name");
				int hit=rs.getInt("g_hit");
				String date=rs.getString("g_date");
				System.out.println(no + "\t" + title + "\t" + name + "\t"
						+ hit + "\t" + date);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();	
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
