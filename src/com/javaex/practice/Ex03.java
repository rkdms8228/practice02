package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if(age>20) {
			System.out.print("\"1번 그룹\"");
		}else {
			System.out.print("\"2번 그룹\"");
		}
		
		System.out.println("입니다.");
		
		//21, 100을 입력하면 1번 그룹/15, 19, 20을 입력하면 2번 그룹으로 출력될 것 같음
		//**20의 경우 if에서 설정한 초과에 해당되지 않아 else로 출력되는 것을 확인함**
		
		sc.close();
		
	}

}
