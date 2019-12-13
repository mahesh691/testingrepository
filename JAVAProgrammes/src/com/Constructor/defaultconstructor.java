package com.Constructor;

import org.apache.poi.xddf.usermodel.chart.DisplayBlanks;

import bsh.This;

public class defaultconstructor {
    //Java Program to create and call a default constructor  
     
    //creating a default constructor  
	defaultconstructor(){
		System.out.println("Bike is created");
		this.display(10);
		} 
	
	int id;  
	String name;  
	//method to display the value of id and name  
	void display(int id){
		System.out.println(id+" "+name);
		}  
	
	defaultconstructor(int i,String n){  
		    id = i;  
		    name = n;  
		    System.out.println(id+" "+name);
		    
		    }  

    //main method  
    public static void main(String args[]){  
    //calling a default constructor  
    	defaultconstructor b1=new defaultconstructor();
    	
    	
}
}