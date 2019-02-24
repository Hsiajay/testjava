package com.java.example.task1;

import java.util.Scanner;

public class ArithTest7 {

	/*求s=a+aa+aaa+aaaa+....的值，a是一个数字，
	例如s=3+33+333+3333+33333五个数字相加,
	几个数字相加，由自己控制*/
	
	/*如何得到这几个数, 
	3+33+333+3333+33333 抽取成
    3+0*10 
    3+3*10(3是上一个算式的和)
    3+33*10(33是上一个算式的和)
    3+333*10(333是上一个算式的和)
    3+3333*10(3333是上一个算式的和)
          看到这里你会想到这是累加,一个累加求这几个数,一个累加求和.
    */
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("请输入一个数");
	        int num = scan.nextInt();
	        int n=0, sum =0;
	        for (int i = 1; i <= 5; i++) {
	            n = n*10 + num;
	            sum=sum+n;
	        }
	        System.out.println(sum);

	}

}
