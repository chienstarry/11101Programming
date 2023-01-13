import java.util.Scanner;

public class Personality {
	protected String Q1="";
	protected String former_mbti="";
	protected String latter_mbti="";
	public String MBTI="";
	private int former=0;
	private int latter=0;

	public Personality(){

	}

	public Personality(String former_mbti, String latter_mbti) {
		
		this.former_mbti = former_mbti;
		this.latter_mbti = latter_mbti;
		
	}
	
	public String judgeMBTI() {
		Scanner output = new Scanner(System.in);
			// Use for loop to judge the three questions.
			for(int i=0 ;i<3;i++) {
				String answer=output.next();

				// Once get the answers, the variables need to be updated.
				if(answer.equals("Y")){former++;}
				else if(answer.equals("N")) {latter++;}
			}
			if(former>latter) {return former_mbti;}
			else {return latter_mbti;}
		}
	}