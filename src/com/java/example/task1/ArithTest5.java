package com.java.example.task1;

import java.util.Scanner;

public class ArithTest5 {
	//5.求两个整数的最大公约数和最小公倍数
	//lowest common multiple (LCM) 最小公倍数
	//greatest common divisor(gcd) 最大公约数

	public static void main(String[] args) {
		
            // 可以输入
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入两个正整数:");
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            System.out.println("最大公约数：" + gcd(m, n));
            System.out.println("最小公倍数：" + lcm(m, n));
            scanner.close();
     
	}
	
	 public static int gcd(int m, int n) {
	        // 用于记录最大数
	        int max = 1;
	        for (int i = 1; i <= n; i++) {
	            if (m % i == 0 && n % i == 0) {
	                if (i > max) {
	                    max = i;
	                }
	            }
	        }
	        return max;
	    }
	    public static int lcm(int m, int n) {
	        //将m,n转化成最小公约数为1，那之后他们的乘积就是代表最小公倍数
	        return n * m / gcd(m, n);

	    }

}
