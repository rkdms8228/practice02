package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String sign = sc.nextLine();
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		switch(sign) {
			case "+":
				double value1 = num1+num2;
				System.out.println("결과는: "+value1);
				break;
			case "-":
				double value2 = num1-num2;
				System.out.println("결과는: "+value2);
				break;
			case "*":
				double value3 = num1*num2;
				System.out.println("결과는: "+value3);
				break;
			case "/":
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
				}else {
					double value4 = num1/num2;
					System.out.println("결과는: "+value4);
				}
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		sc.close();
		
	}

}
