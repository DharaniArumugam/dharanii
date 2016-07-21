package githup;

import java.util.Scanner;

public class hunt {

	 public static void main(String args[]){
		    int a;
		    Scanner in=new Scanner(System.in);
		    a=in.nextInt();
		    if(a>0){
		      System.out.println(a+"is positive");
		    }
		    else if(a<0){
		      System.out.println(a+"is negative");
		    }
		    else{
		      System.out.println(a+"is zero");
		    }
		    
		  }
}
