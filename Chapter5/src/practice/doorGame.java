package practice;
import java.util.Scanner;
public class doorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the Amazing Door Choice Game");
		System.out.print(" with your host Steve Harvey!");
		System.out.print(" Pick a door, any door. \n1- for door one\n2- for door two\n3- for door three\n");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1) {
			result = "pile of gold";
		}
		else if(doorChoice == 2) {
			result = "donkey";
		}
		else if (doorChoice == 3) {
			result = "barely competent cashier whom enjoys having long conversations with the people in front of you in the line.\nLike come on, all I have are some eggs and I'm already five minutes late.\nI'm considering going to a different checkout but I'm not sure if the risk is worth it.";
		}
		else {
			result = "load of nothing. That wasn't an option, you fool.";
		}
		
		displayMessage(result);

	}
	public static void displayMessage(String result) {
		System.out.println("You won a " + result);
	}
}
