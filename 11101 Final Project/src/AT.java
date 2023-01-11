public class AT extends Personality{
    private String Q;

    public AT(){

    }

    public AT(String former_mbti, String latter_mbti) {
        super(former_mbti,latter_mbti);
        Q= "面臨選擇時，你傾向堅定果斷?\n"+"你是否為完美主義?\n"+"面對失敗，你感到畏懼?\n";
    }
    public void printQ(){
        System.out.print(Q);
    }
    
    public void printAT() {
        Summary sum=new Summary();
        if(sum.getMBTI().substring(4).equals("-A")) {
            
        System.out.print("這類人熱衷於獨立地解決問題，不太在意別人的意見，更願意相信自己的直覺和能力。這些人了解自己，知道自己擅長什麼，並且能保持自信，正因如此，他們在表達自己觀點的時候從不猶豫。");
        
        }else if(sum.getMBTI().substring(4).equals("-T")) {
            
            System.out.print("這類人擅長自我反思，他們被稱為不斷進取的人，總是用自己的完美主義，獨立地花時間和精力努力完成任務。他們的成績突出，但自我反思的習慣經常使他們的感情容易大起大落，很在意別人的看法，追求完美主義。");
        }
    }
}
