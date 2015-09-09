import java.util.Scanner;


public class Average {
	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      System.out.print("Enter first number: ");
	      int firstNumber = s.nextInt();
	      System.out.print("Enter second number: ");
	      int secondNumber = s.nextInt();
	      System.out.print("Enter third number: ");
	      int thirdNumber = s.nextInt();
	      int sum = firstNumber + secondNumber + thirdNumber;
	      int average = sum / 3;
	      System.out.println("The result of addition was " + sum);
	      System.out.println("The average of the three numbers is " + average);
	   }
	} 

		 
