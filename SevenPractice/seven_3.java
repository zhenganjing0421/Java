package sevenPractice;

import java.util.Arrays;
public class seven_3 {
	int[] count;  //每个数字的数量
	public static void main(String[] args) {
		new seven_3();
	}
	public seven_3() {
        //初始化
        count = new int[10];
        Arrays.fill(count, 0);
        
        System.out.println("Enter the intergers between 1 and 100： ");
        
        //进行统计
        for(int i=1;i<=100;i++) {          
            statistics(i);
        }
         
        //输出
        for(int i=0;i<10;i++) {
            System.out.println( i + " occurs " + count[i] + " times");
        }
    }
     
    //统计
    private void statistics(int value) {
        String valueString = String.valueOf(value);
        for(int i=0;i<valueString.length();i++) {
            char index = valueString.charAt(i);
            count[new Integer(String.valueOf(index))] ++;
        }
    }

}

