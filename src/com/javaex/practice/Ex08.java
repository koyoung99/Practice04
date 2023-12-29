package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			
			//중복제거
			
			
			System.out.print(num[i] + "\t");
		}

	}

}
