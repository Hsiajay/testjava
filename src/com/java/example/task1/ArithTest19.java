package com.java.example.task1;

public class ArithTest19 {
	
	//19.打印出杨辉三角形

	public static void main(String[] args) {
		
		int triangle[][]=new int[8][];//创建二维数组
        for (int i=0;i<triangle.length;i++){//遍历二维数组的第一层
            triangle[i]=new int[i+1];//初始化第二层数组的大小
            for(int j=0;j<triangle[i].length-1;j++){//遍历第二层数组
                if (i==0||j==0||j==triangle[i].length-1){//两侧的数组元素赋值为1
                    triangle[i][j]=1;
                }else {
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];//其他数值通过公式计算
                }
                System.out.print(triangle[i][j]+"\t");//输出数组元素
            }
            System.out.println();
        }
	}

}
