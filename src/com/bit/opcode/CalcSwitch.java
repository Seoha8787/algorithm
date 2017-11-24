package com.bit.opcode;

import java.util.Scanner;
public class CalcSwitch {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String[] arr = {
				"첫번째 숫자를 입력하세요","연산기호를 입력하세요","두번째 숫자를 입력하세요","사칙연산만 입력하세요","%d %s %d =%d"
		};
		int num1=0,num2=0,result = 0;
		String opcode = "", test = "";
		boolean inputOK = true;
		System.out.print(arr[0]);
		num1 = scanner.nextInt();
		System.out.print(arr[1]);
		opcode = scanner.next();
		System.out.print(arr[2]);
		num2 = scanner.nextInt();
		
		switch(opcode){
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					result = num1 / num2;
					break;
				default:
					inputOK = false;
					break;
		}if(!inputOK) {
			test = arr[3];			
		}else {
			test = String.format(arr[4],num1,opcode,num2,result);
		}
		System.out.print(test);
	}
}




