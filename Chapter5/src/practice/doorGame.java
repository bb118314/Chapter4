package practice;
import java.util.Scanner;
public class doorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String all;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to the Amazing Door Choice Game");
		System.out.print(" with your host Steve Harvey!");
		System.out.print(" Pick a door, any door. \n1- for door one\n2- for door two\n3- for door three\n");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1) 
		{
			System.out.println("Door 1 leads to a room of chests");
			System.out.println("1- For Chest One\n2- For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) 
			{
				result = "You won load of nothing lol";
			}
			else if(chestChoice == 2) 
			{
				result = "You won a pile of gold";
			}
		}
		else if(doorChoice == 2) 
		{
			result = "You won a donkey";
		}
		else if (doorChoice == 3) 
		{
			result = "You won a barely competent cashier whom enjoys having long conversations with the people in front of you in the line.\nLike come on, all I have are some eggs and I'm already five minutes late.\nI'm considering going to a different checkout but I'm not sure if the risk is worth it.";
		}
		else if (doorChoice == 9999) {
			System.out.println("You enter a special room with 3 books on the table. Do you choose Book 1, Book 2, or Book 3?");
			bookChoice = input.nextInt();
			if(bookChoice == 1)
			{
				result = "You wake up, it was just a dream :)";
			}
			else if (bookChoice == 2)
			{
				result = "You break the simulation you are living in";
			}
			else if (bookChoice == 3)
			{
				result = "You are granted the power of flight";
			}
		}
		else {
			result = "You won a load of nothing. That wasn't an option, you fool.";
		}
		
		displayMessage(result);

	}
	public static void displayMessage(String result) {
		System.out.println(result);
	}
}
