package homeworkweek7;

public class Question04 {
    String studentname = "shubh";
    int english = 80;
    static int maths = 90;
    static int economics=80;

    public static void main(String[] args) {
        Question04 t=new Question04();
        t.t1();
        t2();
    }
    public void t1(){
        Question04 t=new Question04();
        System.out.println("studentname="+studentname);
        System.out.println("=========================");
        System.out.println("English marks="+english);
        System.out.println("Maths marks="+maths);
        System.out.println("Economics marks="+economics);

    }
    public static void t2(){
        Question04 t=new Question04();
        System.out.println("verifying results again");
        System.out.println("=========================");
        System.out.println("studentname="+t.studentname);
        System.out.println("=========================");
        System.out.println("English marks="+t.english);
        System.out.println("Maths marks="+maths);
        System.out.println("Economics marks="+economics);

    }





}

