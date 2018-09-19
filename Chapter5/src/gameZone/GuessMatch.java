package gameZone;
import java.util.Scanner;
public class GuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int guess;
		int number;
		 System.out.print("Guess a number between 1 and 5: ");
		 guess = input.nextInt();
		 
		number = (1  + (int)(Math.random() * 5));
		
		if (guess == number)
			System.out.println("Your guess is correct! The number is " + guess + ".");
		
		else if (guess > number)
			System.out.println("Your guess is incorrect! The correct number was " + number + ". You were only " + (guess - number) + " away!");
		
		else if (guess < number)
			System.out.println("Your guess is incorrect! The correct number was " + number + ". You were only " + (number - guess) + " away!");
		
	}

}