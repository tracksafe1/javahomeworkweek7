package stringhomework;
/*Write a java program which replace a “I love java” to “we love java”
Expected output: We love java*/

public class Question03 {
    public static void main(String[] args) {


        String original ="I love java";
        String replace1=original.replace("I","we");
        System.out.println("original="+original);
        System.out.println("Expected output="+replace1);
    }
}
