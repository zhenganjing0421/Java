package three;

import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		//Generate a lottery number
		int lottery = (int)(Math.random()*100);
		
		//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		//Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		//Get digits from guess
		int guessDigit1 = lottery / 10;
		int guessDigit2 = lottery % 10;
		
		System.out.print("The lottery number is " + lottery);
		
		//Check the guess
		if(guess == lottery)
			System.out.print("Exact match: you win $10000");
		else if( guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 )
			System.out.print("Match all digits: you win $3000");
		else if( guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || 
				guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 )
			System.out.print("Match one digit: you win $1000");
		else
			System.out.print("Sorry, no match");
	}
}
