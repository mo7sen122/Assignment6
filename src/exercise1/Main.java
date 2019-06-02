package exercise1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("1","Account1",1000);
		a.credit(1000);
		a.debit(500);
		System.out.println(a.getbalance());
	}

}
