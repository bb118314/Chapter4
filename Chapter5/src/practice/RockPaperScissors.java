package practice;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rock = 1;
		int paper = 2;
		int sc = 3;
		int guess;
		int number;
		 System.out.println("Choose a number to select your weapon\n-1 Rock\n-2 Paper\n-3 Scissors ");
		 guess = input.nextInt();
		 
		 number = (1  + (int)(Math.random() * 3));
		 if(guess == 1) 
		 {
			 if(number == 2) 
			 {
				 System.out.print("You chose rock and lost to paper!");
			 }
			 else if(number == 1)
			 {
				 System.out.print("You both chose rock and tied!");
			 }
			 else if(number == 3)
			 {
				 System.out.print("You chose rock and won against scissors!");
			 }
		 }
		 if(guess == 2)
		 {
			 if(number == 2) 
			 {
				 System.out.print("You both chose paper and tied!");
			 }
			 else if(number == 1)
			 {
				 System.out.print("You chose paper and won against rock!");
			 }
			 else if(number == 3)
			 {
				 System.out.print("You chose paper and lost against scissors!");
			 }
		 }
	}

}
