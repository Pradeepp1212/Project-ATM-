package ATM;
import java.util.ArrayList;

public class Bank {

  private	String name;
  private   int id;
  private   int money;
  private   int pin;
  Bank(String name , int id , int money,int pin)
	{
		this.name = name;
		this.id = id;
		this.money = money;
		this.pin = pin;
	}
	
	// getter and setter
	public String getname()
	{
		return name;
	}
	public int getMoney()
	{
		return money;
	}
	public int getID()
	{
		return id;
	}
	public int getPIN()
	{
		return pin;
	}
	// setters
	public void setname(String naam)
	{
		name = naam;
	}
	public void setMoney(int cash)
	{
		this.money = cash;
	}
	// -> id cannot be set as per our wish it is default by bank admin and standard one
	
	public void finalization(int amt)
	{
		System.out.println("Dear "+ this.name + " You Have Debited rs."+ amt);
		System.out.println("Your Main Balance "+this.getMoney() +"\n Thank You!");
	}
	
    
	

}
