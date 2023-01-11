import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Information{
	private String part2 = "";
	private String name = "";
	private String mbti = "";

	public Information() {
	}

	public void setName(String name){
		this.name = name;
	}

	public String Stringformat(String MBTI) throws FileNotFoundException{
		this.mbti = MBTI;
		File myFile = new File("introduction.txt");
		Scanner myReader = new Scanner(myFile);

		String line = "";
		String[] infoArray;
		while (myReader.hasNextLine()) {
			line = myReader.nextLine();
			infoArray = line.split(" ");
			
			if(infoArray[0].equals(mbti)) {
				part2 = infoArray[1];
				break;
			}
		}
		myReader.close();
		
		String result = String.format("%d, you are a %d. %d", name, mbti, part2);
		return result;
	}
}