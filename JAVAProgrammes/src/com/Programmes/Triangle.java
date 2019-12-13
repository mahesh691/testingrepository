package com.Programmes;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i, j, n=1;
        for(i=0; i<5; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(n+ " ");
                n++;
            }
            System.out.println();
        }
        
        System.out.println("*****************");
        
        
        
		for(int a=1; a<=3; a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" * ");
			}System.out.println("");
		}
		
		
		
	}

}
