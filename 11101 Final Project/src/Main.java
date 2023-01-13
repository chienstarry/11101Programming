import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);

		// Create three objects.
		Summary sum = new Summary();
		Information info = new Information();
		Identity identity = new Identity();

		System.out.println("Welcome to the MBTI test! Please answer the following questions to know yourself better.");
		System.out.println("Please input your name: ");
		info.setName(in.nextLine());
		System.out.println("There are 15 questions. Please answer them with Y/N and seperate them with space.\n ");

		// The calculate method in the Summary class will count the numbers of "Y" or "N", and change the value of the MBTI.
		sum.calculate();

		// The Stringformat method in the Information class will print out the result to the testers.
		try {
			info.Stringformat(sum.getMBTI());
		} catch (FileNotFoundException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		
		// The printAT method will print out the testers' identity based on their MBTI.
		identity.printAT(sum.getMBTI());

		System.out.println("Thank you for participating in this test!");
		in.close();
	}

}
