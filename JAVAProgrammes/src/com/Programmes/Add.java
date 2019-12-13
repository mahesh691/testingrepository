package com.Programmes;
public class Add {
	int num1;
	int num2;
	int result;
	public void perform()
	{
		result=  num1+num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj=new Add();
		
		obj.num1=12;
		obj.num2=13;
		obj.perform();
		
		System.out.println(obj.result);	
		
	}

}
