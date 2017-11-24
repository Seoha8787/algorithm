package com.bit.opcode;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		String[] arr =new String[5];
		arr[] = "이름";
		arr[] = "이름";
		arr[] = "이름";
		arr[] = "이름";
		arr[] = "이름";
		arr[] = "이름";
		int korean = 0, english = 0, math = 0,sum = 0,avg = 0,avg1 = 0;
		String name = "",grade = "";
		System.out.print("이름?\n");
		name = scanner.next();
		System.out.print("국어점수?\n");
		korean = scanner.nextInt();
		System.out.print("영어점수?\n");
		english = scanner.nextInt();
		System.out.print("수학점수?\n");
		math = scanner.nextInt();
		sum = korean + english + math;
		avg = (sum / 3)/10;
		avg1 = sum /3; 
		switch(avg){
		case 10 : grade = "A";
				break;
		case 9 : grade = "B";
				break;
		case 8 : grade = "C";
				break;
		case 7 : grade = "D";
				break;
		case 6 : grade = "E";
				break;
	    default : grade = "F";
	    		break;
	    	

		}
		System.out.printf("%s[평점] %d [학점] %s",name,avg1,grade);
		
	}

}
