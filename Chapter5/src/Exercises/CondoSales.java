package Exercises;
import java.util.Scanner;
public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Welcome to Summerdale Condos!\nEnter the number of which condo you would like to view\n1- Park View\n2- Golf Course View\n3- Lake View");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		if(num == 1) 
		{
			System.out.println("The Park Condo is $150,000");
		}
		else if(num == 2) 
		{
			System.out.println("The Golf Condo is $170,000");
		}
		else if(num == 3) 
		{
			System.out.println("The Lake Condo is $210,000");
		}
		else 
		{
			System.out.println("The Idiot Condo is Free");
		}
	}

}
