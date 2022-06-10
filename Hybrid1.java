package inheritance;

import java.util.Scanner;

public class Hybrid1 {
	int num;
	int i,j,temp;
	int[] arr=new int [num];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void accept() 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for checking:");
		num=sc.nextInt();
		
	}
	public void accept1() 
	{
			accept();
			
			Scanner sc =new Scanner(System.in);
			System.out.println("enter"+num+" number");
			for(i=0;i<num;i++) 
			{
				arr[i]=sc.nextInt();
			}
	}

}
