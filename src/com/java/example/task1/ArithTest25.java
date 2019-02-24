package com.java.example.task1;

import java.util.Scanner;

public class ArithTest25 {
	
	/*25、某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，
	加密规则如下：每位数字都加上5,然后除以10的余数代替该数字，
	再将第一位和第四位交换， 第二位和第三位交换.*/


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个4位正整数：");
	    int n=s.nextInt();
	    //原来的四位数个位置的数字
	    int origFig1=n/1000;//千位上的数字
	    int origFig2=(n-origFig1*1000)/100;//百位上的数字
	    int origFig3=(n-origFig1*1000-origFig2*100)/10;//十位上的数字
	    int origFig4=n%10;//个位上的数字
	    //代替后的数字
	    int repFig1=(origFig1+5)%10;
	    int repFig2=(origFig2+5)%10;
	    int repFig3=(origFig3+5)%10;
	    int repFig4=(origFig4+5)%10;
	    System.out.println("通过运算后新的四位数子："+repFig1+""+repFig2+""+repFig3+""+repFig4);
	    
	    //第一位和第四位互换
	    int a=repFig4;
	    repFig4=repFig1;
	    repFig1=a;

	    //第二位和第三位互换
	    a=repFig2;
	    repFig2=repFig3;
	    repFig3=a;
	    System.out.println("加密后的数字为："+repFig1+""+repFig2+""+repFig3+""+repFig4);
		s.close();
	}

}
