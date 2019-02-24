package com.java.example.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithTest {
	
	/*将一个人民币数字，转换成大写输出
	例如2365489.329元，转换成贰佰叁拾陆万伍千肆佰捌拾玖元叁角俩分玖厘*/
	
	//创建中文大写数字的表和货币单位的表
	static String[] cnNumTab = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒","捌", "玖"};//中文大写数字
	static String[] integerUnitTab = {"", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟"};//整数部分货币单位
	static String[] decimalUnitTab = {"角", "分", "厘"};//小数部分货币单位

	public static void main(String[] args) {
		// TODO 将一个人民币数字，转换成大写输出
		System.out.println("请输入金额：");
		
		//创建流对象，用于接收键盘录入的数据
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			//把键盘接收的金额数据的小数位和整数位分隔开
			String str = in.readLine();
			String[] strArr = str.split("\\.");
			
			//把分隔好的数位金额数据分别打散成字符数组
			char[] chNumArrInteger = strArr[0].toCharArray();
			
			//把阿拉伯数字转换为中文的大写数字
			String[] convertIntegerNum = convertUpper(chNumArrInteger);
			
			//定义合拼数字和单位用的容器
			StringBuilder container = new StringBuilder("圆整");
			
			//嵌入货币单位到转换好的中文大写数字里去
			for(int x = convertIntegerNum.length -1, y = 0; x >=0; x--, y++) {
				String num = convertIntegerNum[x];
				if(num.equals("零")) {
					//判断数位是否是仟万亿的位置，是则插入单位
					if(y == 4 || y == 8)
						container.insert(0, num+integerUnitTab[y]);
					else
						container.insert(0, num);
				} else {
					container.insert(0, num+integerUnitTab[y]);
				}
			}
			
			//如果有小数位，则对小数位的数也进行同样的转换操作
			if(strArr.length == 2) {
				int len = container.length();
				container.replace(len - 2, len, "圆");
				
				char[] chNumArrDecimal = strArr[1].toCharArray();
				String[] convertDecimalNum = convertUpper(chNumArrDecimal);
				
				//嵌入货币单位到转换好的中文大写数字里去
				for (int x = 0; x < convertDecimalNum.length; x++) {
					container.append(convertDecimalNum[x]+decimalUnitTab[x]);
				}
			}
			
			//格式修正
			String put = container.toString();
			put = put.replaceAll("佰零+万", "佰万");
			put = put.replaceAll("佰零+亿", "佰亿");
			put = put.replaceAll("仟零+万", "仟万");
			put = put.replaceAll("仟零+亿", "仟亿");
			put = put.replaceAll("零+", "零");
			put = put.replaceAll("零万", "万");
			put = put.replaceAll("零万零", "零");
			put = put.replaceAll("拾零", "拾");
			put = put.replaceAll("零圆", "圆");
			
			//完成后打印输出
			System.out.println("该金额的大写形式为："+put);
			
		} catch (NumberFormatException e) {
			System.out.println("输入错误，请输入有效的金额数字");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//键盘录入接收完数据后流会自然断开了，无需调用关流资源的方法了
	}
	
	//把阿拉伯数字转换为中文的大写数字
	public static String[] convertUpper(char[] arr) {
		String[] convertNum = new String[arr.length];
		for(int x = 0; x < arr.length; x++) {
			int num = Integer.parseInt(arr[x]+"");
			convertNum[x] = cnNumTab[num];
		}
		
		return convertNum;

	}

}
