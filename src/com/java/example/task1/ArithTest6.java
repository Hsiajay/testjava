package com.java.example.task1;

import java.util.Scanner;

public class ArithTest6 {
	
	//6.输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一行字符");
		String str = scan.nextLine();
		//String str ="我是中国人,Welcome To China! 123";
        int alpCount =0;//英文字母计数
        int blankCount =0;//空格计数
        int digitCount = 0;//数字计数
        int restsCount =0;//其他字符计数
        for (int i = 0; i < str.length(); i++) {
        	
        	char ch = str.charAt(i);
            if(('a'<= ch && ch <= 'z')||('A'<= ch && ch <= 'Z')){
                alpCount++;
            }else if(ch==' '){
                blankCount++;
            }else if('0'<=ch &&ch<= '9'){
            	digitCount++;
            }else {
            	System.out.println(ch);
            	restsCount++;
            }
            
            
            /*if(ch >= 0x0391 && ch <= 0xFFE5){ //中文unicode编码
                System.out.println(ch);
                chineseCount++;//中文字符计数
            }*/
        }
        System.out.println("英文字符数："+alpCount);
        System.out.println("空格数"+blankCount);
        System.out.println("数字字符数："+digitCount);
        System.out.println("其他字符数是："+restsCount);
        
        scan.close();
	}

}
