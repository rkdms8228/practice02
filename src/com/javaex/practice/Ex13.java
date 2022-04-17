package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		double x = sc.nextDouble();
		
		if(x<=0) {
			double fx = (x*x*x)-9*x+2;
			System.out.println("계산 결과는 "+fx+"입니다.");
		}else {
			double fx = 7*x+2;
			System.out.println("계산 결과는 "+fx+"입니다.");
		}
		
		sc.close();

	}

}
