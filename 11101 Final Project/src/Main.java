import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		Information info = new Information();
		Summary sum = new Summary();
		AT at=new AT();

		System.out.println("Welcome to the MBTI test! Please answer the following questions to know yourself better.");
		System.out.println("Please input your name: ");
		info.setName(in.nextLine());

		sum.calculate();
		at.printAT();

		try {
			info.Stringformat(sum.getMBTI());
		} catch (FileNotFoundException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		System.out.println("Thank you for participating in this test!");
		in.close();
	}

}
