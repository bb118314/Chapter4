package practice;
import java.util.Scanner;
public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		 System.out.print("Enter your first number: ");
		 a = input.nextInt();
		 System.out.print("Enter your second number: ");
		 b = input.nextInt();
		 System.out.print("Enter your third number: ");
		 c = input.nextInt();
		 
		 if(a > b && b > c) {
			 System.out.println(a + ", " + b + ", " + c);
			 System.out.println(c + ", " + b + ", " + a);
		 }
		 else if(b > a && a > c) {
			 System.out.println(b + ", " + a + ", " + c);
			 System.out.println(c + ", " + a + ", " + b);
		 }
		 else if(c > b && b > a) {
			 System.out.println(c + ", " + b + ", " + a);
			 System.out.println(a + ", " + b + ", " + c);
		 }
		 else if(b > c && c > a) {
			 System.out.println(b + ", " + c + ", " + a);
			 System.out.println(a + ", " + c + ", " + b);
		 }
		 else if(c > a && a > b) {
			 System.out.println(c + ", " + a + ", " + b);
			 System.out.println(b + ", " + a + ", " + c);
		 }
		 else if(a > c && c > b) {
			 System.out.println(a + ", " + c + ", " + b);
			 System.out.println(b + ", " + c + ", " + a);
		 }


	}

}