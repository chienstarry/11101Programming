import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Summary {
    private String MBTI="";
    public void calculate() throws FileNotFoundException {
        File PFile = new File("personalities.txt");
        Scanner reader = new Scanner(PFile);
        String question="";
        Personality EI = new Personality("E", "I");
        Personality SN = new Personality("S", "N");
        Personality TF = new Personality("T", "F");
        Personality JP = new Personality("J", "P");
        AT at=new AT("-A","-T");
        
        for(int i=0; i<12; i++) {
            
            question += reader.nextLine()+"\n";	
            
        }
       
        System.out.print(question);
        MBTI+=EI.judgeMBTI();
        MBTI+=SN.judgeMBTI();
        MBTI+=TF.judgeMBTI();
        MBTI+=JP.judgeMBTI();
        MBTI+=at.judgeMBTI();
       reader.close();

    }
    public String getMBTI(){
       return MBTI;
   }
}   