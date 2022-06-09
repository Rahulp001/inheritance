package inheritance;

import java.util.Scanner;

public class Accept {
	int num1,num2;
	public void use() 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
	}
}

package inheritance;

public class Child1 extends Accept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj=new Child1();
		obj.sum();
	}
	
	public void sum() 
	{
		use();
		int res;
		res=num1+num2;
		System.out.println("addition is "+res);
	}

}
package inheritance;

public class Child2 extends Accept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj=new Child2();
		obj.sub();

	}
	public void sub() 
	{
		use();
		int res;
		res=num1-num2;
		System.out.println("substraction is "+res);
	}

}
package inheritance;

public class Child3 extends Accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child3 obj=new Child3();
		obj.mul();

	}
	public void mul() 
	{
		use();
		int res;
		res=num1*num2;
		System.out.println("multiplication is "+res);
	}

}
package inheritance;

public class Child4 extends Accept{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child4 obj=new Child4();
		obj.div();

	}
	public void div() 
	{
		use();
		int res;
		res=num1/num2;
		System.out.println("division is "+res);
	}

}
package inheritance;

public class Child5 extends Accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child5 obj=new Child5();
		obj.mod();

	}
	public void mod() 
	{
		use();
		int res;
		res=num1%num2;
		System.out.println("mod is "+res);
	}

}
