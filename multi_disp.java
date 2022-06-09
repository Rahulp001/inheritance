//WAP to create a class Reverse No, second class SOD , Third class use both the class property and display the output

package inheritance;

import java.util.Scanner;

public class multi_disp extends SOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      multi_disp obj=new multi_disp();
      obj.display();
      
	}
	public void display() 
	{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=sc.nextInt();
	digit_sum(num);
	rev(num);
		
	}

}
