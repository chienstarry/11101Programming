import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Information{
	private String description = "";
	private String name = "";
	private String mbti = "";

	public Information() {}

	public void setName(String name){
		this.name = name;
	}

	public void Stringformat(String MBTI) throws FileNotFoundException{
		this.mbti = MBTI;
		// Read the file containing the descriptions of MBTI.
		File myFile = new File("introduction.txt");
		Scanner myReader = new Scanner(myFile); 

		// Create the variable to determine the corresponding description.
		String line = "";
		while (myReader.hasNextLine()) {
			line = myReader.nextLine(); 
			
			// If the testers' MBTI equals the index, its description will be assigned to the variable, description.
			if(line.substring(0, 4).equals(mbti.substring(0, 4))) {
				description = line.substring(line.indexOf(" ") + 1);
				break;
			}
		}
		
		myReader.close();
		
		// Print out the result of MBTI.
		String result = String.format("%s, you are a %s.\n%s", name, mbti, description);
		System.out.println(result);
	}
}
