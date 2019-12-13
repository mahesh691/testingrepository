package com.SushanthTest;

public class ArrayConcept {

	
	public static void main(String args[]) {

        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java","Python" };
        int a;
        		for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if(names[i].equals(names[j])) {
                	          
                		System.out.println(names[i]+" "+names[i].equals(names[j])+" "+names[j]);
                		
                }else {
                	
                	
                } 
            }
        }
	}
}
	



