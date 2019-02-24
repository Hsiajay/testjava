package com.java.example.task1;

public class ArithTest10 {
	
	//10.有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少?

	public static void main(String[] args) {
		
		int count = 0;//计算个数
        int n = 0;//组成的三位数
        for(int i = 1 ;i<=4; i++){//循环三次组成三位数
            for(int j = 1;j<=4;j++){//个位
                for(int k =1; k<=4;k++){//十位
                    if (i != j && j != k && i != k){//百位
                        count++;//计数器，计算个数
                        n = i + j*10 + k*100;
                        System.out.println(n);                                             
                    }
                }
            }                     
        } 
        System.out.println("共组成"+count+"个");
	}

}
