package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			int quotient = num1/num2;
			int remainder = num1%num2;
			System.out.println("몫: "+quotient);
			System.out.println("나머지: "+remainder);
		}else {
			int quotient = num2/num1;
			int remainder = num2%num1;
			System.out.println("몫: "+quotient);
			System.out.println("나머지: "+remainder);
		}
		
		sc.close();

	}

}
