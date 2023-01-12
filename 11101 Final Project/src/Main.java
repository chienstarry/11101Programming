import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		Information info = new Information();
		Summary sum = new Summary();
		Identity identity = new Identity();

		System.out.println("Welcome to the MBTI test! Please answer the following questions to know yourself better.");
		System.out.println("Please input your name: ");
		info.setName(in.nextLine());
		System.out.println("There are 15 questions. Please answer them with Y/N and seperate them with space.\n ");

		sum.calculate();

		try {
			info.Stringformat(sum.getMBTI());
		} catch (FileNotFoundException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		
		
		identity.printAT(sum.getMBTI());

		
		System.out.println("Thank you for participating in this test!");
		in.close();
	}

}
