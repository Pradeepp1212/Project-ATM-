package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class USER_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList <Bank> CustomerList = new ArrayList<>();
		CustomerList.add(new Bank("Pradeep",12,2000812,1212));
		CustomerList.add(new Bank("Elakiya",39,12787,2004));
		CustomerList.add(new Bank("Akshay",45,80000,6701));
		
		
		//Atm Area
        System.out.println("Press 1 to Enter or 0 to Exit");
        Scanner useroption = new Scanner(System.in);
        int useropt = useroption.nextInt();
        if(useropt==0) System.out.println("Thank You");
		
		while(useropt==1)
		{
			Atm user = new Atm();
			int confirmation = user.getconfirmationWithdraw();
			if(confirmation==1) //if confirmed to withdraw we can encounter withdraw method
			{
				int capture = user.Withdraw(CustomerList);	
					useropt=0;
					break;
			}
		}
		
		
		
		
		
	}

}
