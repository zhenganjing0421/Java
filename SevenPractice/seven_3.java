package sevenPractice;

import java.util.Arrays;
public class seven_3 {
	int[] count;  //ÿ�����ֵ�����
	public static void main(String[] args) {
		new seven_3();
	}
	public seven_3() {
        //��ʼ��
        count = new int[10];
        Arrays.fill(count, 0);
        
        System.out.println("Enter the intergers between 1 and 100�� ");
        
        //����ͳ��
        for(int i=1;i<=100;i++) {          
            statistics(i);
        }
         
        //���
        for(int i=0;i<10;i++) {
            System.out.println( i + " occurs " + count[i] + " times");
        }
    }
     
    //ͳ��
    private void statistics(int value) {
        String valueString = String.valueOf(value);
        for(int i=0;i<valueString.length();i++) {
            char index = valueString.charAt(i);
            count[new Integer(String.valueOf(index))] ++;
        }
    }

}

