import java.util.File;
import java.util.Scanner;
public class Information extends Personality{
	private String introduction = "";

	public Information(String name, String personality) {
		super(name, personality);
	}

	public String Stringformat(){
		Scanner input = new Scanner(new File("introduction.txt"));
		
		String result = String.format("%d, you are a %d. %d", name, personality, introduction);
		return result;
	}
}