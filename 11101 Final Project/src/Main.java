import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Personality mbti = new Personality();
		Information info = new Information();

		System.out.println("Welcome to the MBTI test! Please answer the following questions to know yourself better.");
		System.out.println("Please input your name: ");
		info.setName(in.nextLine());

		try {
			info.Stringformat(mbti.getMBTI());
		} catch (FileNotFoundException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		System.out.println("Thank you for participating in this test!");
		in.close();
	}

}
