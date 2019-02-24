package com.java.example.task1;

public class ArithTest9 {
	
	/*5.一球从100米高度自由落下，每次落地后反跳回原高度的一半；
	再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？*/

	public static void main(String[] args) {
		double sumHig1 = 0, sumHig2 = 0, hight = 100.0;

        for (int i = 0; i < 10; i++){
            //下落的距离之和
        	sumHig1 = sumHig1 + hight;
            // 显示了一下高度的变化
            System.out.print(hight);
            hight = hight / 2;
            System.out.print(" "+hight);
            System.out.println();
            if (i < 9){
                //反弹的距离之和
            	sumHig2 = sumHig2 + hight;
                //System.out.println(sumHig2);
            }
        }
        System.out.println("第10次落地时，共经过" + (sumHig1 + sumHig2) + "米");
        System.out.println("第十次反弹高度为" + hight + "米");

	}

}
