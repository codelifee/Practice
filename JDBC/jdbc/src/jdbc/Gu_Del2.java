package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import net.abc.dao.GuDAOImpl;
import net.abc.vo.GuVO;

public class Gu_Del2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("type a number : ");
		int no=Integer.parseInt(scan.nextLine());
		
		GuDAOImpl gdao=new GuDAOImpl();
		GuVO db_no=gdao.findNo(no);
		
		if(db_no != null) {
			System.out.println("the number is : " +db_no.getG_no());
			
			int re=gdao.delGu(no);
			
			System.out.println(re);
						
			if(re==1) {
				System.out.println("delete successful");
			} else {
				System.out.println("there is something wrong");
			}
			
		} else {
			System.out.println("there is no such number");
		}
		
		scan.close();
		
	}
}
