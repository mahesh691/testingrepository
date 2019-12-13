package com.Programmes;

class combined
{
			String mom;
			String dad;
			String result;	
		
			public void perform(){
				result=mom + dad;
			}
}

public class MomDad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				combined obj=new combined();
						obj.mom="NAMBAKKA";
						obj.dad="SHANKAR";
						obj.perform();
						
						System.out.println(obj.result);
						
						
	}

}

