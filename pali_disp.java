//WAP to create a class which contain the method Palindrom .the second class will use the proerty of first class and display the output.

package inheritance;

import java.util.Scanner;

public class pali_disp extends palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      pali_disp obj=new pali_disp();
      obj.display();
	}
	public void display() 
	{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=sc.nextInt();
	pali(num);
		
	}

}
