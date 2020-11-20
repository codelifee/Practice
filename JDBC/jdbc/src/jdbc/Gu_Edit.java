package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Gu_Edit {
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
			Scanner sc=new Scanner(System.in);
			System.out.print("write guest book :");
			int no=Integer.parseInt(sc.nextLine());
			sql="select g_no from gu where g_no=?";
			
			pt=con.prepareStatement(sql);
			pt.setInt(1, no);
			rs=pt.executeQuery();
			
			if(rs.next()) {
				System.out.println("modified writer : ");
				String name=sc.nextLine();
				System.out.println("modified title : ");
				String title=sc.nextLine();
				System.out.println("modified contents : ");
				String cont=sc.nextLine();
				
				sql="update gu set g_name=?,g_title=?,g_cont=? where g_no=?";
				pt=con.prepareStatement(sql);
				
				pt.setString(1, name);
				pt.setString(2, title);
				pt.setString(3, cont);
				pt.setInt(4, no);
				int re=pt.executeUpdate();
				if(re==1) {
					System.out.println("succeeded");
				} 
			} else {
				System.out.println("there is no such number");
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
