package com.java.example.task1;

public class ArithTest11 {
	
	/*11、在1-1000内有一个整数，它加上100后是一个完全平方数，
	再加上168又是一个完全平方数，请问该数是多少？*/

	public static void main(String[] args) {
		//开始前计时
		//long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			//获得正确舍入正平方根 double值。 
			double x = Math.sqrt(i + 100);
			double y = Math.sqrt(i + 268);
			if (x == (int) x && y == (int) y) {
				System.out.println("这个数是:" + i);
				continue;
			}
		}
		//结束时计时
		/*long endTime = System.currentTimeMillis();
		System.out.println("time:" + (endTime - startTime));*/
	}

}
