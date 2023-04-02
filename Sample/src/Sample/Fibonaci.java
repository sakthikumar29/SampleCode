package Sample;

import java.util.Scanner;
public class Fibonaci {
	static Scanner s=new Scanner(System.in);
		public static void main(String[] args) 
		{
			System.out.println("Enter the range:");
			int num=s.nextInt();
			int n1=0,n2=1,n3=0;
			System.out.print(n1+" "+n2);
			for(int i=3;i<=num;i++)
			{
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
	}
