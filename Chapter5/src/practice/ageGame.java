package practice;
import java.util.Scanner;
public class ageGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many years you have been alive: ");
		age = input.nextInt();
		
		if(age < 13); 
		{
			System.out.print("Children suck. You are why I will not have kids.");
		}
		
		else if(age > 12 && age < 19) 
		{
			result = "You are a teenager lol. go listen to green day or something.";
		}
		
		else if(age > 18 && age < 26)
		{
			result = "Get a job loser";
		}
		

	}
	public static void displayMessage(result) {
		System.out.print(result); }
}
