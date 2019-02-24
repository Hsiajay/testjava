package com.java.example.task1;

import java.util.Calendar;

public class ArithTest12 {
	
	//12、输入某年某月某日，判断这一天是这一年的第几天?

	public static void main(String[] args) {
		
		getDay(2018,8,27);
		//getDay(2018,1,26);
	}
	
	/**
     * 求输入相应的年月日，输出对应的多少天 
     * 采用数组的形式
     * @param year 年
     * @param month 月
     * @param day 日
     */
    public static void getDay(int year,int month,int day){
        //1、定义相关的变量
        int sumDays=0;//对应的总天数
        int[] monthDay={0,31,28,31,30,31,30,31,31,30,31,30};//对应月份要加上的天数

        //2、判断是否为闰年并且月份大于2   若是2月份为29天
        if((year%4==0&&year%100!=0||year%400==0)&&month>2){
            monthDay[2]=29;//将闰年的二月份多出的一天加上
        }

        //3、根据月份计算天数
        for (int i = 0; i < month; i++) {
            sumDays+=monthDay[i];
        }

        //4、加上当月对应的天数
        sumDays+=day;
        System.out.println(year+"年"+month+"月"+day+"日是今年的第 "+sumDays+" 天！");
    }
    
    public static void getDay1(int year,int month,int day) {
    	Calendar cal = Calendar.getInstance();
    	cal.set(year, month-1, day);
    	cal.get(Calendar.DAY_OF_YEAR);
    }

}
