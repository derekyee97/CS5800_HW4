package CS5800HW4;

public class Account 
{
	private AccountHolder holder;
	private double balance = 0.0;
	
	public Account(double amt, AccountHolder holder)
	{
		balance=amt;
		this.holder=holder;
	}
	public void deposit(double amt)
	{
		balance+=amt; 
	}
	public void withdraw(double amt)
	{
		if(amt>balance)
		{
			System.out.println("Not enough balance"); //not enough balance 
		}
		balance-=amt; 
		
	}
	public double getBalance()
	{
		return balance;
	}
	public AccountHolder getHolder()
	{
		return holder;
	}
	public void setBalance(double amt)
	{
		balance=amt; 
	}
	public void setHolder(AccountHolder holder)
	{
		this.holder=holder;
	}
	
}
