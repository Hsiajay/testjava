package com.java.example.task1;

public class GraphTest {

	/*1. 给定一个rSquare,表示一个圆的半径的平方,某圆的圆心在坐标系原点.
	计算返回处在该圆圆周上的格点(横纵坐标均为整数的点)*/

	public static void main(String[] args) {
		int line = 7;
		int i,j;
		
		for(i=1;i<=(line+1)/2;i++) {
			for(j =1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=(line+1)/2;i++) {
			for(j=1;j<=2*((line+1)/2-i)-1;j++){
                System.out.print("*");
            }
			System.out.println();
		}
		

	}

}
