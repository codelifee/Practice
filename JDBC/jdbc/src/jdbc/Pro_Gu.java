package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Pro_Gu {

	public static void main(String[] args) {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="week7";
		String pwd="week7";
		
		Connection con=null;
		PreparedStatement pt=null;
		ResultSet rs=null;
		CallableStatement cs=null;
		String sql=null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pwd);
			Scanner scan=new Scanner(System.in);
			System.out.println("type a number : ");
			int no=Integer.parseInt(scan.nextLine());
			sql="select g_no from gu where g_no=?";
			pt=con.prepareStatement(sql);
			pt.setInt(1, no);
			rs=pt.executeQuery();
					
			if(rs.next()) {
				sql="{call sel_gu(?,?,?,?)}";
				cs = con.prepareCall(sql);
				cs.setInt(4, no);
				
				cs.registerOutParameter(1, java.sql.Types.VARCHAR);
				cs.registerOutParameter(2, java.sql.Types.VARCHAR);
				cs.registerOutParameter(3, java.sql.Types.VARCHAR);
				
				cs.execute();
				System.out.println("no \t title \t name \t cont");
				System.out.println("===========================");
				System.out.println(no+"\t"+cs.getString(2)+"\t"+cs.getString(1)+"\t"+cs.getString(3));
				
			} else {
				System.out.println("there is no such number");
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(cs != null) cs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
				if(rs != null) rs.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

