package sevenPractice;

import java.util.*;
public class seven_5 {
 
	public static void main(String[] args) {
		int i,j,c=0;
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[10];//��������;
		int[] record=new int[10];
		System.out.print("Enter 10 numbers :");
		for(i=0;i<numbers.length;i++)
		{
			numbers[i]=input.nextInt();
		}
		for(i=0;i<numbers.length;i++)
		{
			for(j=i+1;j<record.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					numbers[j]=0;//������forѭ��,��������������ǰ�����,�ͰѺ���ĸ�ֵΪ0;
				}
			}
		}
		for(i=0,j=0;i<numbers.length;i++)
		{
			if(numbers[i]!=0)
			{
				record[j]=numbers[i];//��������һ���µ�����,Ȼ����˵�0;
				/*record[i]=number[i];���ﲻ����ôд����Ϊ����Ĭ�ϵ�ֵΪ0�������丳ֵ����ľ���0,�Ͳ���1 2 3 6 4 5�����м���0*/
				j++;
				c++;//��¼�м�����ͬ����;
			}
		}
		System.out.println("The number of distinct numbers is " + c);
		for(i=0;i<j;i++)//�����������Ȳ�����record.length�������������ĺ������0,��J����c��ʾ;
		{
			System.out.println("The distinct numbers are : " + record[i]);
		}
		
 
	}
 
}