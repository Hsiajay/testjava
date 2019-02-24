package com.java.example.task1;

import java.util.Iterator;
import java.util.LinkedList;

public class ArithTest22 {
	
	/*6.有10个人围成一圈报数，从1开始，报到3的退出，
	重新开始从1开始报数报到3的退出，依次类推，
	问最后剩下人的是原来第几个人*/


	public static void main(String[] args) {
		
		ArithTest22.countNum();
		ArithTest22.countNum1();
		
	}
	//普通数组方法
	public static void countNum() {
		int [] num= new int[10];
		for(int i=0;i<10;i++){
			num[i]=i+1;
		}
		/*for(int i=0;i<10;i++){
			System.out.print(num[i]+" ");
		}*/
		
		int i=0;//索引
		int quitnum=0;//退出的人数
		int k=0;//计数
		
		while(quitnum < 9){
			if(num[i]!=0)
				k++;
			if(k==3){
				num[i]=0;//数到3的人退出
				quitnum++;
				k=0; 
			}
			i++;
			if(i==10)
				i=0;
		}
		//System.out.println();
		
		for(int j=0;j<10;j++){
			if(num[j]!=0){
				System.out.println("普通数组方法的结果是：最后剩下人的是原来第"+num[j]+"个人");
			}
		}
	}
	
	//利用LinkedList集合解决
	public static void countNum1() {
		int number = 0;//计数器
        int count = 10;//玩家的总数

        LinkedList<Integer> li = new LinkedList<>();
        for(int i = 1; i <= count; i++){
            li.add(i);
        }

        //用迭代器，每次取出数组中的下个元素
        Iterator<Integer> it = li.iterator();
        while(count > 1){
        //每次进行迭代，如果有下个元素，计数器+1
            if(it.hasNext()){
                it.next();
                ++number;
            }else{
            //如果没有下个元素，迭代器从新赋值，即从头开始
                it = li.iterator();
            }
            //如果找到元素，把计数器归零，移除元素，总数-1
            if(number == 3){
                number = 0;
                it.remove();
                count--;
            }
        }
        System.out.println("利用LinkedList集合的结果：最后剩下人的是原来第"+li.element()+"个人");
	}

}
