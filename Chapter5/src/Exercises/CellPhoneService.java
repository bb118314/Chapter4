package Exercises;
import java.util.Scanner;
public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int talk;
		int data;
		int text;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Horizon Phones!");
		System.out.println("Please input the maximum number of talk minutes you would like: ");
		talk = input.nextInt();
		System.out.println("Please input the maximum number of text messages you would like: ");
		text = input.nextInt();
		System.out.println("Please input the maximum number of gigabytes of data you would like: ");
		data = input.nextInt();
		
		if(talk <= 500 && data == 0) 
		{
			if(text == 0) 
			{
				System.out.println("We recommend you use Plan A for $49 a month");
			}
			else 
			{
				System.out.println("We recommend you use Plan B for $55 a month");
			}
		}
		else if(talk > 500 && data == 0)
		{
			if(text <= 100) 
			{
				System.out.println("We recommend you use Plan C for $61 a month");
			}
			else 
			{
				System.out.println("We recommend you use Plan D for $70 a month");
			}
		}
		else if(data > 0)
		{
			if(data <= 2) 
			{
				System.out.println("We recommend you use Plan E for $79 a month");
			}
			else 
			{
				System.out.println("We recommend you use Plan F for $87 a month");
			}
		}
	}

}
