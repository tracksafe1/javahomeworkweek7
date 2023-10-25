package stringhomework;
/*Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”*/
public class Question02 {
    String removespace="   I love Java    ";
    public static void main(String[] args) {
        Question02 t=new Question02();

       t.t1();
    }
    public static void t1(){
        Question02 t=new Question02();

        System.out.println("original"+t.removespace);
        System.out.println("Expected output:"+t.removespace.trim());
    }

    }

