package com.java.example.task1;

public class ArithTest24 {
	
	/*24、海滩上有一堆桃子，五只猴子来分。
	第一只猴子把这堆桃子平均分为五份，多了一个，
	这只猴子把多的一个扔入海中，拿走了一份。
	第二只猴子把剩下的桃子又平均分成五份，
	又多了一个，它同样把多的一个扔入海中，
	拿走了一份，第三、第四、第五只猴子都是这样做的，
	问海滩上原来最少有多少个桃子？*/

	public static void main(String[] args) {
		int n = 6;
		while (true) {
			n = n + 5;
			int index = n;
			int t = 0;
			int i;
			for (i = 1; i <= 5; i++) {
				if ((index - 1) % 5 == 0) {
					index = (index - 1) / 5 * 4;
					t++;
				} else {
					break;
				}
			}
			if (t == 5) {
				System.out.println(n);
				break;
			}
		}
	}
}
