package com.bit.opcode;

import java.util.Scanner;

public class WhoAreYou {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"이름이 뭐에요?","당신은 %s 입니다"
		};
		String name = "";
		System.out.print(arr[0]);
		name =s.next();
		System.out.printf(arr[1],name);
		
	}
	
}

