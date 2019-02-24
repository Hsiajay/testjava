package com.java.example;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Author     ：xiajie 20:39 2018/12/24
 * @ Description：
 */
public class Test {
    //private String res = "0";
    public static void main(String[] args){

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        int sum = 0;
        String str = ((Integer)num).toString();
        char[] chars = str.toCharArray();
        for(int i = 0; i<chars.length; i++){
            sum+=(chars[i]-48);
        }
        System.out.println(sum);*/
       /* int i = 2,j=4;
        boolean k;
        k = (i++)>0 && (++j-4)>0;
        System.out.println(i*j);*/


        /*Test t=new Test();
        int a = t.func(987);
        System.out.println("反数为:"+a);*/

        int arr[] = {1,29,10,23,5,20};
        int insertNum = 0;

        for (int i = 1; i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                insertNum = arr[i];
                int j;
                for (j = i-1; j>=0&&arr[j]>insertNum; j--){

                    arr[j+1] = arr[j];

                }
                arr[j+1] = insertNum;
            }
        }
        System.out.println(Arrays.toString(arr));
       /* int array[] = {1,29,10,23,5,20};
        int i, j, t = 0;
        for (i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]){
                t = array[i];
                for (j = i - 1; j >= 0 && t < array[j]; j--)
                    array[j + 1] = array[j];
                //插入array[i]
                array[j + 1] = t;
            }
        }
        System.out.println(Arrays.toString(array));*/



    }

    /*public int func(int i){
        if(i>0){
            int temp = i%10;
            res = res+String.valueOf(temp);
            func(i/10);
        }
        return Integer.valueOf(res);
    }*/
}
