package com.Employeedetails;

import java.util.Scanner;

import com.Bank.BankDetails;

public class Employees {
	String employeeId	;
	String employeeName	;
	String employeeAddress;	
	long	employeePhone;	
	double basicSalary;	
	double specialAllowance	 =250.80;
	double Hra=1000.50;
	double salary;
	static int persons;
	Scanner scan= new Scanner(System.in);

	public void read()
    {
		
       System.out.println("Enter the employee id"+employeeId);//taking all the inputs from the user
       System.out.println("Enter the employee name:"+employeeName);
       
       System.out.println("Enter the basic salary of an employee");
       basicSalary=scan.nextDouble();
       System.out.println("Enter the address of an employee");
       employeeAddress=scan.next();
       System.out.println("Enter the phone number of an employee");
       employeePhone=scan.nextInt();
       calculatesalary();
    }
	
	public void calculatesalary() {
		salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
		
	}
	
	public void display() {
		System.out.println("emp id  : "+ employeeId +"\n"+ "employee name : "+ employeeName+ "\n"+ "basic salary : "+basicSalary + "\n"+
	"address :"+ employeeAddress+"\n"+"phone number : "+ employeePhone+"\n "+"salary : "+ salary);
	}
	
	boolean search(String id)
	{ 
		if(employeeId.equals(id))
		{ 
			display();
			return(true);
		}else {
		return(false);}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan2= new Scanner(System.in);
	       System.out.println("Enter number U Want to create Employees : ");
			persons=scan2.nextInt();
			Employees  C[]=new Employees[persons];
		for(int i=0;i<C.length;i++)
		{   C[i]=new Employees();
			C[i].read();
			C[i].calculatesalary();
			C[i].display();
		}
		int ch;
		do {
		System.out.println("choose options :\n 1).Add employee \n 2).Display details \n 3).Exit");
		 ch=scan2.nextInt();

		switch(ch) {
		case 1:
		for(int i=0;i<C.length;i++)
		{
			C[i].read();
		}
		break;
		
		case 2:
			System.out.print("Enter id  U Want to Search...: ");
			String id=scan2.next();
			boolean found=false;
			for(int i=0;i<C.length;i++)
			{  
				found=C[i].search(id);
				if(found)
				{
					break;
				}
			}
			if(!found)
			{
				System.out.println("Search Failed..id Not Exist..");
			}
			break;
		}
		}
		while(ch!=3) ;
		
		}

}
