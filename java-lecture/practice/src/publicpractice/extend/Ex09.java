package publicpractice.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
	String customerId;
	String customerPw;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPw() {
		return customerPw;
	}
	public void setCustomerPw(String customerPw) {
		this.customerPw = customerPw;
	}
}

class Ex09 {
	
	
	static void login(List<User> list) {
		Scanner scan = new Scanner(System.in);
		
		User user = new User();
		System.out.println("���� ������ �����մϴ�.");
		System.out.printf("����: ");
		user.setCustomerId(scan.nextLine());
		System.out.printf("�н�����: ");
		user.setCustomerPw(scan.nextLine());
		list.add(user);
		System.out.println(list);
	}

	
	static void deposit(List<User> list) {
		User user = new User();
		
		
		User n = list.get(0);
		
	}
	
	public static void main(String[] args) {
		
	}	
}