package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 15;
		
		if (age>0 && age<18) {
			System.out.println("청소년입니다.");
		}
		
		sc.close();
		
	}

}
