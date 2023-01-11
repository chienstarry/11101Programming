import java.util.Scanner;

public class Personality {
	protected String Q1="";
	protected String Q2="";
	protected String Q3="";
	protected String former_mbti="";
	protected String latter_mbti="";
	public String MBTI="";
	private int former=0;
	private int latter=0;

	public String getMBTI(){
		return MBTI;
	}

	public void askQuestion() {
		String Question = Q1+"\n"+Q2+"\n"+Q3+"\n"+"(each answer split by the space)";
		System.out.print(Question);
	}

	public void judgeMBTI() {
		Scanner output= new Scanner(System.in);
		//y就屬於前一個n就屬於後一個
		for(int i=0;i<3;i++) {
			String answer = output.next();
			if(answer.equals("Y")){former++;}
			else if(answer.equals("N")) {latter++;}
		}
		if(former>latter) {MBTI+=former_mbti;}
		else {MBTI+=latter_mbti;}
		output.close();
	}
}

 class AT extends Personality{
	 public AT() {
		 super.Q1="面臨選擇時，你傾向堅定果斷?";
		 super.Q2="你是否為完美主義?";
		 super.Q3="面對失敗，你感到畏懼?";
		 super.former_mbti="-A";
		 super.latter_mbti="-T";
		 

	 }}
 class EI extends Personality{
	 public EI() {
		 super.Q1="面對新朋友你會主動交談嗎？";
		 super.Q2="比起獨處，你更享受與他人聚在一起的時光？";
		 super.Q3="你在學校的時候很受歡迎嗎？";
		 super.former_mbti="E"; 
		 super.latter_mbti="I";
		 

	 }}
 class SN extends Personality{
	 public SN() {
		 super.Q1="你有運動的習慣嗎？";
		 super.Q2="你並不喜歡看推理類小說？";
		 super.Q3="當學習新事物時，你更注重實際用途？";
		 super.former_mbti="S";
		 super.latter_mbti="N";
		 

	 }}
 class TF extends Personality{
	 public TF() {
		 super.Q1="相較於寫作，你更善於計算?";
		 super.Q2="當你在搭電梯遇到電梯故障時，比起手足無措，你會冷靜撥打求救電話?";
		 super.Q3="當你與他人意見不同時，比起妥協，你選擇堅持己見?";
		 super.former_mbti="T"; 
		 super.latter_mbti="F";
		 

	 }}
 class JP extends Personality{
	 public JP() {
		 super.Q1="在做事前，比起直接開始，你更喜歡事前規劃好?";
		 super.Q2="比起壓線交作業，你都會提早交?";
		 super.Q3="你的房間乾淨嗎?";
		 super.former_mbti="J";
		 super.latter_mbti="P";
		 
		 
	 }}