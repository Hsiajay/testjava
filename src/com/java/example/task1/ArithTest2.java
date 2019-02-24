package com.java.example.task1;

import java.util.Random;
import java.util.TreeSet;

public class ArithTest2 {
	//2、随机产生20个不重复的小写字母并且排序？ 

	public static void main(String[] args) {

		char[] c = new char[26];
		Random random = new Random();
		int count = 0;
		while(true){
			int i = random.nextInt(26);
			if (c[i] == '\u0000') {
				c[i] = (char) (i + 97);
				count++;
			}
			if (count == 20) {
				break;
			}
		}
		for (char ca : c) {
			if (ca != '\u0000') {
				System.out.print(ca + " ");
			}
		}
		System.out.println("^^^^^^^^^^^^");
		gather();
	}
	
	public static void gather() {
		Random random = new Random();
		TreeSet<Character> trs = new TreeSet<>();
		while(trs.size()<20) {
			char ch = (char)(random.nextInt(26)+97);
			trs.add(ch);
		}
		System.out.println(trs);
	}

}
