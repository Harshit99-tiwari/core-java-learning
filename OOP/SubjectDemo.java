package OOP;

public class SubjectDemo {
    public static void main(String[] args) {
         Subject sub[]=new Subject[3];
     sub[0] = new  Subject("A5", "harsh");
     sub[1]= new  Subject("A3", "kansh");
     sub[2]= new  Subject("A1", "ansh", 100, 90);
     
     for(Subject s:sub){
        System.out.print("SubjectID: "+s.getSubId() + " | "+ 
        "StudentNAME: "+s.getName()+   " | "+
        "MaxMark: "+s.getMaxMarks()+ " | "+
        "MarkObtain: "+s.getMarksObtain()+"  | ");
     }
    }

static class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String sid,String n){
        this.subId=sid;
        this.name=n;
    }
    public Subject(String sid,String n,int Maxm,int Marko){
         this.subId=sid;
        this.name=n;
         setMaxMarks(Maxm);
        setMarksObtain(Marko);
    }

    public String getSubId() {
        return subId;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

}
}
