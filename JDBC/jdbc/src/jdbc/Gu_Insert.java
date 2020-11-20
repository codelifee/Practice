package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Gu_Insert {
	
	public static void main(String[] args) {
		String driver="oracle.jdbc.OracleDriver";
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String user="week7";
		String pwd="week7";
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String sql=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pwd);
			st=con.createStatement();
			Scanner scan = new Scanner(System.in);
			System.out.println("store date in Gu table");
			System.out.print("writer: ");
			String name=scan.nextLine();
			System.out.print("title: ");
			String title=scan.nextLine();
			System.out.println("content: ");
			String cont=scan.nextLine();
			
			sql="insert into gu (g_no, g_name, g_title, g_cont, g_date) values(gno_seq.nextval,'"
					+name+"','"+title+"','"+cont+"',sysdate)";
			
			int re=st.executeUpdate(sql);
			
			if(re==1) {
				System.out.println("successfully stored");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
