package privatepractice.projects;

public class BankingApplication {

	public static void main(String[] args) {
		Account bank = new Account();
		SignUp user = new SignUp(1, "sumin");
		
		bank.showMenu();
	}

}
