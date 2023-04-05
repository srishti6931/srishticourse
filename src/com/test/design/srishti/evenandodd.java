package com.test.design.srishti;
import java.util.Scanner;
public class evenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
