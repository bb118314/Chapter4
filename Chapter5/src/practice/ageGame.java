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
			result = "Children suck. You are why I will not have kids.";
		}
		
		if(age > 12 && age < 19) 
		{
			result = "You are a teenager lol. go listen to green day or something.";
		}
		
		else if(age > 18 && age < 26)
		{
			result = "Get a job loser";
		}
		else if(age > 25 && age < 40)
		{
			result = "u r dummy";
		}
		else if(age > 39 && age < 60)
		{
			result = "Better start digging your grave";
		}
		else if(age > 59)
		{
			result = "You look like a skeleton";
		}
		displayMessage(result);
	}
	public static void displayMessage(String result) {
		System.out.println(result);
	}
}
