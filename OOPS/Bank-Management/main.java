package BankManagement;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
	   private double amount;
	   
	   public InsufficientFundsException(double amount) {
	      System.out.println("exception due to low balance ");
	   }
	   public double getAmount() {
		      return amount;
		   }
}
class Account
{
	private String accno;
	private long balance;
	private String name;
	
	Scanner s = new Scanner(System.in);
	
	//FUNCTION TO ENTER USER DETAILS FOR CHECKING FURTHER OPERATIONS 
	void openAccount()
	{
		System.out.println("Enter Account No:- ");
		accno = s.next();
		System.out.println("Enter Account Holder's name:- ");
		name = s.next();
		System.out.println("Enter balance in account:- ");
		balance = s.nextLong();
	}
	
//	FUNCTION TO DEPOSIT MONEY IN ACCOUNT 
	void deposit()
	{
		long amount;
		System.out.println("Enter the amount you need to deposit:- ");
		amount = s.nextLong();
		balance = balance + amount;
	}
	
	void withdraw() throws InsufficientFundsException
	{
		long amount;
		System.out.println("Enter the amount you need to withdraw:- ");
		amount = s.nextLong();
			if(balance >= amount)
			{
				balance = balance - amount;
			}
			else
			{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
			
		}
	}
	
	
//	FUNCTION TO ACCOUNT 
	void showAccount() {
        System.out.println(accno + "," + name + "," + balance);
    }

//	FUNCTION TO SEARCH EXISTING ACCOUNT 
	boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
	
	
}

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//CREATING ACCOUNT USING USER INPUTS 
		System.out.println("enter how many user input you want:- ");
		int n = s.nextInt();
		Account A[] = new Account[n];
		for(int i=0; i<A.length; i++)
		{
			A[i]=new Account();
			A[i].openAccount();
		}
		int ch;
		do
		{
			System.out.println("Main Menu\\n1. Display All\\n 2. Search By Account\\n 3. Deposit\\n 4. Withdrawal\\n 5.E xit ");
			System.out.println("Enter your choice:- ");
			ch = s.nextInt();
			switch(ch)
			{
			case 1:    //SIAPLAYING ALL ACCOUNT 
				for(int i=0; i<A.length; i++)
				{
					A[i].showAccount();
				}
				break;
				
			case 2:    //SEARCHING ACCOUNT 
				System.out.println("Enter Account no to be searched:- ");;
				String acn = s.next();
				boolean found = false;
				for(int i=0; i<A.length; i++)
				{
					found = A[i].search(acn);
					if(found)
					{
						break;
					}
					
				}
				if(!found)
				{
					System.out.println("Search Failed Inavlid Account number");
				}
				break;
				
			case 3:     //DEPOSIT MONEY IN ACCOUNT 
                System.out.print("Enter Account No : ");
                acn = s.next();
                found = false;
                for (int i = 0; i < A.length; i++) {
                    found = A[i].search(acn);
                    if (found) {
                        A[i].deposit();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search Failed..Account Not Exist..");
                }
                break;
                
			case 4:    //WITHDRWA MONEY FROM ACCOUNT 
                System.out.print("Enter Account No : ");
                acn = s.next();
                found = false;
                for (int i = 0; i < A.length; i++) {
                    found = A[i].search(acn);
                    if (found) {
                    	try
                    	{
                    		A[i].withdraw();
                    		break;
                    	}
                        catch(InsufficientFundsException e)
                    	{
                        	System.out.println(e);
                    	}
                    }
                }
                if (!found) {
                    System.out.println("Low balance cannot withdraw");
                }
                break;

            case 5:    //EXIT THE CODE 
                System.out.println("Code Exited ");
                break;
        }
    }
    while (ch != 5);  
				
			}
}
