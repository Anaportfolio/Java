package banco;

public class Main {

	public static void main(String[] args) {
		
		BusinessAccount account = new BusinessAccount(8010, "Bob Brown",10.0,500.0);
		System.out.print(account.getBalance());
	}

}
