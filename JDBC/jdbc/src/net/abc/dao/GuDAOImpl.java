package net.abc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
