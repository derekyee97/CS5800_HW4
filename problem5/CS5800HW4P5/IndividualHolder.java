package CS5800HW4;

public class IndividualHolder extends AccountHolder 
{

	private String name;
	private String SSN;
	
	public IndividualHolder(int ID, String address, String name, String ssn) 
	{
		super(ID, address);
		this.name=name;
		this.SSN=ssn;	
		
	}
	public String getName()
	{
		return name;
	}
	public String getSSN()
	{
		return SSN;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSSN(String ssn)
	{
		this.SSN=ssn;
	}

}
