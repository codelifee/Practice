package privatepractice.projects;

public class BankingApplication {

	public static void main(String[] args) {
		Account bank = new Account();
				
		new UserDAO().join(new UserDTO("sumin", "jung"));
		
		new SignUp("sumin", "jung");
		
		
		
		bank.showMenu();
		
		
	}

}
