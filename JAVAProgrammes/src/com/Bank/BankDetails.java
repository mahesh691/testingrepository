package com.Bank;

import java.util.Scanner;

public class BankDetails {
	
	private String accno;
	private String name;
	private long balance;

	Scanner scan=new Scanner(System.in);
	
	//method to open an account
	void openAccount()
	{ 
		System.out.print("Enter Account No: ");
		accno=scan.next();
		System.out.print("Enter Name: ");
		name=scan.next();
		System.out.print("Enter Balance: ");
		balance=scan.nextLong();
	}

	//method to display account details
	void showAccount()
	{ 
		System.out.println("Account No: " +accno);
		System.out.println( "Name : "+name );
		System.out.println( "Balance : "+balance);
	}

	//method to deposit money
	void deposit()
	{
		long amounnt;
		System.out.println("Enter Amount U Want to Deposit : ");
		amounnt=scan.nextLong();
		balance=balance+amounnt;
		System.out.println("present account balance : "+ balance);
	}

	//method to withdraw money
	void withdrawal()
	{
		long amounnt;
		System.out.println("Enter Amount U Want to withdraw : ");
		amounnt=scan.nextLong();
		if(balance>=amounnt)
		{ 
			balance=balance-amounnt;
			System.out.println("present account balance : "+ balance);

		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
	}

	//method to search an account number
	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}else {
		return(false);}
	}

	public static void main(String[] args) {
		
Scanner p=new Scanner(System.in);
		
		//create initial accounts
		System.out.print("How Many Customer U Want to Input : ");
		int persons=p.nextInt();
		BankDetails  C[]=new BankDetails[persons];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new BankDetails();
			C[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
			System.out.println("Main Menu \n 1.Display All\n 2.Search By Account\n 3.Deposit\n 4.Withdrawal\n 5.Exit");
			System.out.println("Ur Choice :");
			ch=p.nextInt();
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No U Want to Search...: ");
					String acn=p.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=p.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn=p.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 5:
					System.out.println("Good Bye..");
					break;
			}
		}
		while(ch!=5);

	}

}
