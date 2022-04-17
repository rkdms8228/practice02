package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		int profit = sc.nextInt();
		
		if(0<=profit && profit<=1000) {
			double tax = 0.09*profit;
			System.out.println("소득세는 "+tax+"입니다.");
		}else if(1000<profit && profit<=4000) {
			double tax = (1000*0.09)+(profit-1000)*0.18;
			System.out.println("소득세는 "+tax+"입니다.");
		}else if(4000<profit && profit<8000) {
			double tax = (1000*0.09)+(3000*0.18)+(profit-4000)*0.27;
			System.out.println("소득세는 "+tax+"입니다.");
		}else if(profit>=8000) {
			double tax = (1000*0.09)+(3000*0.18)+(4000*0.27)+(profit-8000)*0.36;
			System.out.println("소득세는 "+tax+"입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();

	}

}
