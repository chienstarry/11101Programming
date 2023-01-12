import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Summary {
	
    private String MBTI="";
    private ArrayList<String> questions = new ArrayList<String>();
    
    public void calculate() throws FileNotFoundException {
        File PFile = new File("D:\\OneDrive\\桌面\\111-1課程\\程式設計一\\11101Programming\\11101Programming\\11101 Final Project\\"+"questions.txt");
        Scanner reader = new Scanner(PFile);
        Personality EI = new Personality("E", "I");
        Personality SN = new Personality("S", "N");
        Personality TF = new Personality("T", "F");
        Personality JP = new Personality("J", "P");
        Identity at=new Identity("-A","-T");
        
        for (int i = 0; i < 12; i++) { //把問題存進陣列裡
        	
        	String question = reader.nextLine();
        	questions.add(question);
        	
        }

        	for(int j=0; j<3; j++) {
        		
                System.out.println(questions.get(j));
        		
        	}
        	
            MBTI += EI.judgeMBTI();
            
            for(int j=3; j<6; j++) {
        		
                System.out.println(questions.get(j));
        		
        	}
        	
            MBTI += SN.judgeMBTI();
            
            for(int j=6; j<9; j++) {
        		
                System.out.println(questions.get(j));
        		
        	}
        	
            MBTI += TF.judgeMBTI();
            
            for(int j=9; j<12; j++) {
        		
                System.out.println(questions.get(j));
        		
        	}
        	
            MBTI += JP.judgeMBTI();
            
        
        
        at.printQ(); //ok
        MBTI += at.judgeMBTI();
        
        reader.close();

    }
    public String getMBTI(){
       return MBTI;
   }
}   