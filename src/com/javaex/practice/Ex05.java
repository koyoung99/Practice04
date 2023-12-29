package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int sum = 0, avg = 0;

		for (int i = 0; i < 5; i++) {

			num[i] = sc.nextInt();
			sum += num[i];
			avg = sum / 5;
		}
		System.out.println("평균은 " + avg + " 입니다.");

	}

}
