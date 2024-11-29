package easyQuestions;

import java.util.Scanner;

public class Q20 {
	public static String bomb(String str) {
		if(str.toLowerCase().contains("bomb")) {
			return "duck!";
		}else {
		return "relax, there is no bomb!";
		}
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		
		System.out.println(bomb(s1)); 
		
	}

}
