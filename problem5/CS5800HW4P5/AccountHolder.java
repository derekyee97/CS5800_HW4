package CS5800HW4;

import java.util.Random;

abstract class AccountHolder
{
	private int ID; 
	private String address; 
	
	public AccountHolder(int ID, String address)
	{
		ID=this.ID;
		address=this.address;
	}
	public int nextID()
	{
		return new Random().nextInt(10000000);
	}
	
	
}
