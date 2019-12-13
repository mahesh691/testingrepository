package com.Programmes;

class mixed
{
			String mom;
			String dad;
			String result;	
		
			public void perform(){
				result=mom + dad;
			}
}

public class Names {
	int a;
	int b;
	int add;
	public void test1() {
		add= a+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				mixed obj=new mixed();
						obj.mom="NAMBAKKA";
						obj.dad="SHANKAR";
						obj.perform();
						
						System.out.println(obj.result);
						Names m=new Names();
							m.a=1;
							m.b=2;
							m.test1();
						System.out.println(m.add);
						
						
	}

}

