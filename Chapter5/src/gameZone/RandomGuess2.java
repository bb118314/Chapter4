package gameZone;
import java.util.Scanner;
public class RandomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int guess;
		int number;
		int quit;
		do {
		 System.out.print("Guess a number between 1 and 10: ");
		 guess = input.nextInt();
		 
		number = (1  + (int)(Math.random() * 10));
		goHome(guess, number);
		System.out.println("Do you want to quit? 1 for yes, 2 for no.");
		quit = input.nextInt();

		}while(1 != quit);
	}
	
	public static void goHome(int guess, int number) {
		if (guess == number)
			System.out.println("Your guess is correct! The number is " + guess + ".");
		
		else if (guess > number)
			System.out.println("Your guess is incorrect! The correct number was " + number + ". You were only " + (guess - number) + " above!");
		
		else if (guess < number)
			System.out.println("Your guess is incorrect! The correct number was " + number + ". You were only " + (number - guess) + " under!");
	}

}