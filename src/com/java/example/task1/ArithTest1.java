package com.java.example.task1;

import java.util.Scanner;

public class ArithTest1 {
	
	/*.古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
	小兔子长到第三个月后每个月又生一对兔子，
	假如兔子都不死，问每个月的兔子总数为多少？*/


	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		int mouth =0;
		while(true){
			System.out.println("请输入月份");
			mouth = scan.nextInt();
			if(mouth<1) {
				System.out.println("月份不能小于1");
				break;
			}
			else
				System.out.println("第"+mouth+"个月兔子的总数为："+totalNum(mouth)*2);
			
		}*/
		int mou =0;
		for(mou = 1;mou<=12;mou++) {
			System.out.println("第"+mou+"个月兔子的总数为："+totalNum(mou)*2);
		}

	}
	
	public static int totalNum(int mouth) {
		if(mouth<=2) {
			return 1;
			
		}else{
			return (totalNum(mouth-1)+totalNum(mouth-2));
		}
			
	}

}
