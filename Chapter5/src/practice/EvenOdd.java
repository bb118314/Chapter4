package practice;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num = input.nextInt();
		if(num % 2 == 0)
		{
			System.out.print("The number is even");
		}
		else 
		{
			System.out.print("The number is odd");
		}

	}

}
