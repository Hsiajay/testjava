package com.java.example.task1;

import java.util.Scanner;

public class ArithTest20 {
	
	/*有n个整数，使其前面各数顺序向后移m个位置，
	最后m个数变成最前面的m个数*/

	public static void main(String[] args) {
		int n =10;
		int[] a = new int[n];
		Scanner s = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("你输入的数组为：");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("请输入向后移动的位数：");
		int m = s.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = a[n-m+i];
		}
		for(int i=n-1; i>=m; i--) {
			a[i] = a[i-m];
		}
		for(int i=0; i<m; i++) {
			a[i] = b[i];
		}
		System.out.print("移位后的数组是：");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
