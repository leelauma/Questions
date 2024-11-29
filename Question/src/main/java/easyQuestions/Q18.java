package easyQuestions;

import java.util.Scanner;

public class Q18 {
	public static String sayHelloBye(String str,int num) {
		if(num==1) {
			return "Hello "+ str;
		}
		 return "Bye "+ str;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		System.out.println("enter 0 or 1:");
		int n=sc.nextInt();
		System.out.println(sayHelloBye(s,n));
	}

}
