package com.java.example.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithTest16 {
	
	//16.一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同.

	public static void main(String[] args) {
		
		int n = 0;
		System.out.print("请输入一个5位数：");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try{
		  n = Integer.parseInt(buf.readLine());
		}catch(IOException e){
		    e.printStackTrace();
		}finally{
		    try{
		      buf.close();
		    }catch(IOException e){
		        e.printStackTrace();
		    }
		}
		palinNum(n);
	}
	
	private static void palinNum(int n){
        int m =n;
		int[] a = new int[5];
        if(n<10000 || n>99999){
            System.out.println("输入的不是5位数！");
            return;
        }else{
        	for(int i=0;i<5;i++){
               //获得每一位的数字
        	   a[i] = n%10;
               n /= 10;
            }
            if(a[0]==a[4] && a[1]==a[3])
               System.out.println(m+"是一个回文数");
            else
               System.out.println(m+"不是回文数");
        }
   }

}
