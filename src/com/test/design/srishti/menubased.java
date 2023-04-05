package com.test.design.srishti;
import java.util.Scanner;
public class menubased {
	public static void main(String[] args)
	{
		    System.out.println("enter your choice");
		    Evenodd evenodd=new Evenodd();
		    System.out.println("enter your no.");
			Primeno primeno=new Primeno();
			Fact fact =new Fact();
			
			
	}

}
class Evenodd{
	public void name() {
		Scanner scanner=new Scanner(System.in);
        System.out.println("enter your no.");
        int num=scanner.nextInt();
        if(num%2==0)
        {
        	System.out.println("even");
        }
        else
        {
        	System.out.println("odd");
        }
	}
}
class Primeno{
	public void name() {
		int num, i, count=0;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      num = s.nextInt();
	      
	      for(i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");
	}
}
class Fact{
public void name() {
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number: ");
     int num=sc.nextInt();
     int i=1,fact=1;
     while(i<=num)
     {
         fact=fact*i;
         i++;
     }
     System.out.println("Factorial of the number: "+fact);
}
}

