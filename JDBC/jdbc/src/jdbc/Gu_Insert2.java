package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import net.abc.dao.GuDAOImpl;
import net.abc.vo.GuVO;

public class Gu_Insert2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("type number");
		
		int no=Integer.parseInt(sc.nextLine());
		
		GuDAOImpl gdao = new GuDAOImpl();
		GuVO db_no=gdao.findNo(no);
		
		if(db_no != null) {
			System.out.println("the number is " + db_no.getG_no());
		} else {
			System.out.println("there is no number");
		}
		
	}
	
}
