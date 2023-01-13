import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Summary {
	
    private String MBTI="";
    private ArrayList<String> questions = new ArrayList<String>();
    
    public void calculate() throws FileNotFoundException {
        // Read the questions' file.
        File PFile = new File("questions.txt");
        Scanner reader = new Scanner(PFile);

        // Set the corresponding traits to the yes&no options.
        Personality EI = new Personality("E", "I");
        Personality SN = new Personality("S", "N");
        Personality TF = new Personality("T", "F");
        Personality JP = new Personality("J", "P");
        Identity identity = new Identity("-A","-T");
        
        // Store the questions into the string arraylist.
        for (int i = 0; i < 12; i++) { 
        	
        	String question = reader.nextLine();
        	questions.add(question);
        	
        }

        // Print out the questions and update the testers' MBTI.

        for(int j=0; j<3; j++) {System.out.println(questions.get(j));}
        MBTI += EI.judgeMBTI();
        
        for(int j=3; j<6; j++) {System.out.println(questions.get(j));}
        MBTI += SN.judgeMBTI();
        
        for(int j=6; j<9; j++) {System.out.println(questions.get(j));}
        MBTI += TF.judgeMBTI();
        
        for(int j=9; j<12; j++) {System.out.println(questions.get(j));}
        MBTI += JP.judgeMBTI();
            
        // Call the Identity calss to print the questions.
        identity.printQ();
        // Add the identity into the testers' MBTI. 
        MBTI += identity.judgeMBTI();
        
        reader.close();

    }

    public String getMBTI(){
       return MBTI;
   }
}   