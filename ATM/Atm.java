package ATM;
import java.util.ArrayList;
import java.util.Scanner;

public class Atm{
	
private	int id;
private	int amount;
private int confirmWithdraw;
private int attempt=0;    
	Atm()
	{
		System.out.println("Enter your BANK ID");
		Scanner idscan = new Scanner(System.in);
		this.id = idscan.nextInt();
		
		System.out.print("Enter Amount : ");
		Scanner cash = new Scanner(System.in);
		this.amount = cash.nextInt();
	
		System.out.print("Confirmation\" press 1 to Enter Else 0 to Exit \"");
		Scanner confirmation = new Scanner(System.in);
		this.confirmWithdraw = confirmation.nextInt();
		
	}
	
	//getters
	public int getconfirmationWithdraw()
	{
		return this.confirmWithdraw;
	}
	
	
	//main method!
	
	public int Withdraw(ArrayList<Bank> CustomerList)
	{
		int tracker =0;
		for(Bank cous : CustomerList)
		{
		   if(cous.getID() == this.id)
		   {
              if(cous.getMoney() < amount || cous.getMoney()<1001) {
              System.out.println("BANK BALANCE LOW"); 
              break;  
              } //edge case 
              
              else {
			  int m =  cous.getMoney();
			  int a =  this.amount;
			  System.out.println("WITHDRAW AMT - "+ a);
			 
			  tracker = pin(m,a,cous);
			  //PIN
			  if(tracker>=2) 
			  {
				  System.out.println("TLE or 3 Attempts Occured");
				  break;
			  }
			  
              }
		   }
		}
		return tracker;
	}

	public int pin(int m, int a, Bank cous)
	{
		  
		  System.out.println("Enter Pin Number");
		  Scanner pinscan = new Scanner(System.in);
		  final int pinno = pinscan.nextInt(); 
		  if(attempt>=2) return attempt;
		  
		  if(pinno == cous.getPIN())
		  {
		  cous.setMoney(m-a);
		  cous.finalization(a);
		  }
		  else
			  {
			   System.out.println("WRONG PIN");
			   attempt++;
			   pin(m,a,cous);
			  }
		  
		  return attempt;
		  
      }
	
        
	


}
