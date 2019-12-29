package sevenPractice;

import java.util.Scanner;

public class seven_34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		System.out.println(sort(s));
	}
	
	public static String sort(String s) {
		char[] chars = s.toCharArray();
		for (int i= 0;i < chars.length- 1;i++){
			for (int j= 0;j < chars.length- 1 -i;j++){
				if (chars[j] > chars[j+ 1]) {
					char temp = chars[j];
					chars[j] = chars[j+ 1]; 
					chars[j+ 1] = temp;
			}
		}
	}
	return String.copyValueOf(chars);
	}
}
	
	