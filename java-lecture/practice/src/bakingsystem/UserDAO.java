package bakingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	public int login(String id, String password) {
		String SQL = "SELECT password FROM USER WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		  conn = DatabaseUtil.getConnection();
		  pstmt = conn.prepareStatement(SQL);
		  pstmt.setString(1, id);
		  rs = pstmt.executeQuery();
		  if(rs.next()) {
			  if(rs.getString(1).equals(password)) {
				  return 1; //login success
			  } else {
				  return 0; // wrong password
			  }
		  }
		  return -1; // ID does not exist
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return -2; // database error
	}
	
	public int join(UserDTO user) {
		String SQL = "INSERT INTO USER VALUES (?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DatabaseUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPassword());
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Something went wrong");
		} finally {
			try {if(conn != null) conn.close();} catch (Exception e) {e.printStackTrace();}
			try {if(pstmt != null) pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (Exception e) {e.printStackTrace();}
		}
		return -1; //register failure
		
	}
}
