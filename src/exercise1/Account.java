package exercise1;

public class Account {

	private int accountn;
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id,String name) {
		this.id =id;
		this.name =name;
	}
	
	public Account(String id,String name,int balance) {
		this.id =id;
		this.name = name;
		this.balance = balance;
	}

    public int getaccountn()
    {
        //getting the accountnum variable instance
        return accountn;
    }
   
    public void setaccountn(int accountn)
    {
        //setting the accountnum variable value
        this.accountn = accountn;
    }
    
    public String getid()
    {
        //getting the id variable instance
        return id;
    }
   
    public void setid(String id)
    {
        //setting the id variable value
        this.id = id;
    }
    
    public String getname()
    {
        //getting the name variable instance
        return name;
    }
   
    public void setname(String name)
    {
        //setting the name variable value
        this.name = name;
    }

    public int getbalance()
    {
        //getting the balance variable instance
        return balance;
    }
   
    public void setbalance(int balance)
    {
        //setting the balance variable value
        this.balance = balance;
    }
    
    public int credit(int amount) {
    balance = balance +amount;
    	return balance;
    }
    
    public int debit(int amount) {
    if(amount<=balance) {
    	balance=balance-amount;
    }else {
    	System.out.println("Amount exeed balance");
    }
    	return balance;
    }
    
    public int transferto(int accountn,int amount) {
    	if(amount<=balance) {
    		balance =balance-amount;
        	System.out.print("account id "+accountn+ "has now balance "+balance);
        }else {
        	System.out.println("Amount exeed balance");
        }
    	return 1;
    } 
    
    /*public String tostring() {
    	
    	return toString();
    }*/
}
