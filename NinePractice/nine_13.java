package NinePractice;

import java.util.Scanner;

public class nine_13 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns in the array ");
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();//�����ά�������
        int column = input.nextInt();//�����ά�������

        double[][] a = new double[row][column];
        System.out.println("Enter the array:");//���������е�Ԫ��

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();//�ӿ���̨��������Ԫ��
            }
        }
        input.close();

        System.out.println("The location of the largest element is " + locateLargest(a).maxValue + " at " +
                (locateLargest(a).row + "," + locateLargest(a).column));
    }

    public static Location locateLargest(double[][] a) {//��������һ��Location����
        Location location = new Location();//����һ��Location����

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (location.maxValue < a[i][j]){
                    location.maxValue = a[i][j];//�ҳ���ά������Ԫ�ص����ֵ����ֵ���������е�ʵ������maxValue
                    location.row = i;//�ҳ����ֵ���и�ֵ��ʵ������row
                    location.column = j;//�ҳ����ֵ���и�ֵ��ʵ������column
                }

            }
        }
        return location;//����location����
    }
}

public class Location{

    public int row;//����������row��column��maxValue
    public int column;
    public double maxValue;


}

