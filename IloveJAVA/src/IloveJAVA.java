import java.util.Scanner;
public class IloveJAVA {

	public static void main(String[] args) {
		int height = 0, width=0, depth=0;
		System.out.println("Enter the height width and depth \nof the box you want to calculate the volume of: ");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Height: ");
		height = keyboard.nextInt();
		System.out.println("Width: ");
		width = keyboard.nextInt();
		System.out.println("Depth: ");
		depth = keyboard.nextInt();
		int volume = height * width * depth;
		System.out.println("The volume of the box is " + volume);
	}

}
