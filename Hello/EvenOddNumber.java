package hello;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[6];
		int count1=0;
		int count2=0;
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
			if(array[i]%2==0)
				count1++;//the number of even
			else
				count2++;//the number of odd
		}
		System.out.println("The number of even: "+count1);
		System.out.println("The number of odd: "+count2);
	}

}
