package com.java.example.task1;

import java.util.Arrays;
import java.util.Scanner;

public class ArithTest26 {
	
	/*2. 给定五个整数,它们最小众倍数是指能够被其中至少三个数整除的最小正整数.
	现有各不相同的的整型a,b,c,d以及e.请返回它们的最小众倍数.*/

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		System.out.println("请输入五个整数：");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i] = input.nextInt();
		}
		
		getLmm(arr);
		input.close();
	}
		
		
	public static void getLmm(int[] arr) {
		
		int count = 0;//最小众倍数能被整除的整数个数计算
		int result = 0;
		Arrays.sort(arr);//将数组排序
		System.out.println("排序后的五个整数数组为："+Arrays.toString(arr));
		for(int i = arr[2];i>=arr[2];i++) {//最小的最小众倍数肯定是大于或等于arr[2]
			count = 0;
			for(int j=0;j<5;j++) {
				if(i%arr[j]==0) {
					count++;//每满足一次条件加1
				}
			}
			if(count >= 3) {//如果count>=3 则满足题目条件
				result = i;
				break;
			}
		}
		System.out.println("这五个整数的最小众倍数为："+result);
	}
}