import java.util.File;
import java.util.Scanner;
public class Personality {
	private String name = "";
	private int yes;
	private int no;
	private String personality = "";

	public Personality(){
	}

	public setName(String newName){
		this.name = newName;
	}

	public String questions(){
		Scanner input1 = new Scanner(new File("questions.txt"));
		System.out.println("If the answer is true, press "y", or press "n".");
		for(int i = 0; i < 6; i++){
			judgement();
			addPersonality()
		}
	}

	public void judgement(){
		Scanner answer = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			System.out.println(input.nextLine());
			if(answer.nextLine().equals("y")){
				yes ++;
			}else{
				no ++;
			}
		}
	}

	public void addPersonality(){
		Scanner input2 = new Scanner(new File("measurement.txt"));
		if(yes > no){
			personality += input2.nextLine();
		}else{
			personality += input2.nextLine();
		}
		yes, no = 0;
	}
}