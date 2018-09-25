package Exercises;
import java.util.Scanner;
public class CondoSales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int num2;
		System.out.println("Welcome to Summerdale Condos!\nEnter the number of which condo you would like to view\n1- Park View\n2- Golf Course View\n3- Lake View");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		System.out.println("\nWhat parking would you prefer?\n1- Garage \n2- Parking Space");
		num2 = input.nextInt();
		if(num == 1) 
		{
			if(num2 == 1) {
			System.out.println("\nThe Park Condo with a garage is $155,000");
			}
			else {
				System.out.println("\nThe Park Condo is $150,000");
			}
		}
		else if(num == 2) 
		{
			if(num2 == 1) {
				System.out.println("\nThe Golf Condo with a garage is $175,000");
				}
				else {
					System.out.println("\nThe Golf Condo is $170,000");
				}
		}
		else if(num == 3) 
		{
			if(num2 == 1) {
				System.out.println("\nThe Lake Condo with a garage is $215,000");
				}
				else {
					System.out.println("\nThe Lake Condo is $210,000");
				}
		}
		else 
		{
			System.out.println("\nThe Idiot Condo is Free");
		}
	}

}
