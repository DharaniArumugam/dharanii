package h1;

import java.util.Scanner;

public class h11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number  :");
		int num=sc.nextInt();
		int remai,total=0;
		for(;num>0;num/=10)
		{
			remai=num%10;
			total+=(remai*remai*remai);
		}
		System.out.println("sum of square of given number "+total);
		}


}
