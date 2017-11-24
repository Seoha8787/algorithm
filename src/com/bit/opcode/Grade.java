package com.bit.opcode;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		String[] arr = {"이름?","국어 점수?","영어 점수?","수학 점수?"};
		int korean = 0, english = 0, math = 0,sum = 0,avg = 0,avg1 = 0;
		String name = "",grade = "";
		System.out.print(arr[0]);
		name = scanner.next();
		System.out.print(arr[1]);
		korean = scanner.nextInt();
		System.out.print(arr[2]);
		english = scanner.nextInt();
		System.out.print(arr[3]);
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
