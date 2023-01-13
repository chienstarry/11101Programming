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
		//不用用成陣列
		//直接以一列為單位來看，不須使用空格分開。直接把那列當作是一個字串，擷取第0~3個字串即可

		while (myReader.hasNextLine()) {
			
			line = myReader.nextLine(); //會讀到下一行
			
			if(line.substring(0, 4).equals(mbti.substring(0, 4))) {
				part2 = line.substring(line.indexOf(" ") + 1);
				break;
				
			}
		}
		
		
		myReader.close();
		
		String result = String.format("%s, you are a %s.\n%s", name, mbti, part2);
		System.out.println(result);
		return result;
	}
}
