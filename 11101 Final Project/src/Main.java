import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Sacnner(System.in);
		System.out.println("Welcome to the MBTI test! Please answer the following questions to know yourself better.");
		System.out.println("Please input your name: ");
		Personality info = new Personality();
		info.setName(in.nextLine());

		System.out.println("Thank you for participating in this test!");
	}

}
