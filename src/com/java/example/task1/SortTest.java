package com.java.example.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class SortTest {

	//1.对10数字，进行整体排序（不允许使用Arrays.sort()方法）

	public static void main(String[] args) {
		
		int[] arr = {6,9,10,1,8,4,3,2,7,5};
		System.out.println("排序前的结果为："+Arrays.toString(arr));
		
		for(int j=0;j<=arr.length-2;j++){
			for(int i=0;i<=arr.length-2-j;i++){
				System.out.println("第"+i+"次交换前："+Arrays.toString(arr));
				if(arr[i]>arr[i+1]){
					int tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			System.out.println("第"+i+"次交换后："+Arrays.toString(arr));
			}
			
		}
		System.out.println("排序的结果为："+Arrays.toString(arr));
		/*ArrayList al = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
			
		}
		for(int i=0;i<al.size();i++) {
			al.get(i).;
		}
		System.out.println(al);*/	

	}

}
