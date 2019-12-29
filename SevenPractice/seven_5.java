package sevenPractice;

import java.util.*;
public class seven_5 {
 
	public static void main(String[] args) {
		int i,j,c=0;
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[10];//定义数组;
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
					numbers[j]=0;//用两个for循环,如果后面的数等于前面的数,就把后面的赋值为0;
				}
			}
		}
		for(i=0,j=0;i<numbers.length;i++)
		{
			if(numbers[i]!=0)
			{
				record[j]=numbers[i];//将它赋给一个新的数组,然后过滤掉0;
				/*record[i]=number[i];这里不能这么写，因为数组默认的值为0，不给其赋值输出的就是0,就不是1 2 3 6 4 5而是中间有0*/
				j++;
				c++;//记录有几个不同的数;
			}
		}
		System.out.println("The number of distinct numbers is " + c);
		for(i=0;i<j;i++)//这里的输出长度不能是record.length，如果这样输出的后面就是0,用J或者c表示;
		{
			System.out.println("The distinct numbers are : " + record[i]);
		}
		
 
	}
 
}