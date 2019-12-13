package com.Inheritance;

class Animalss{  
void eat(){
	System.out.println("eating...");
	}  
}  
class Dogss extends Animalss{  
void bark(){
	System.out.println("barking...");
	
}  
}  
class Catss extends Animalss{  
 void meow(){
	System.out.println("meowing...");
}  
}  
public class HierarchicalInheritance {
	public static void main(String args[]){  
		Catss c=new Catss(); 
		c.eat();
		c.meow();  
		c.eat();  
		}
}
