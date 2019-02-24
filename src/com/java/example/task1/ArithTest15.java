package com.java.example.task1;

public class ArithTest15 {
	
	//15.有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。

	public static void main(String[] args) {
		
		sum(20);
		
	}
	
	public static void sum(int n) {
		double sum = 0;
        double n1 =2;
        double n2 = 1;
        double sn = 0;
        for (int i = 0; i <n; i++) {
            sum += n1/n2;
            sn = n1+n2;
            n2 = n1;
            n1 = sn;
        }
        System.out.println(sum);
	}
	
}
