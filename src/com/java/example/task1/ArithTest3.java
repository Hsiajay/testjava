package com.java.example.task1;

public class ArithTest3 {
	/*
	3.判断101-200之间有多少个素数，并输出所有素数。
	程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
	如果能被整除， 则表明此数不是素数，反之是素数。
	 */

	public static void main(String[] args) {
		primeNumJudge();

	}
	
	public static void primeNumJudge() {
		int i = 0;
		int j = 0;
		int count = 0;
		for(i = 100;i<=200;i++) {
			for(j = 2;j<=i;j++) {
				if(i!=j &&i%j==0) {
					break;
				}else if(i == j && i % j == 0) {
					System.out.println(i);
					count++;
					break;
				}
			}
		}
		System.out.println("素数的个数为："+count);
	}
}


