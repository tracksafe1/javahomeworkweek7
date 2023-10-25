package homeworkweek7;

public class Question05 {
    public static void main(String[] args) {


        Question05 t = new Question05();
        t.addition(3, 4);
        subtraction( 6,2);
        t.multiplication(4,8);
        division(8,2);

    }


    public void addition(int a, int b) {
        Question05 t = new Question05();
        System.out.println("sum of a,b=" + (a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("difference ofa,b=" + (a - b));
    }

    public void multiplication(int a, int b) {
        Question05 t = new Question05();
        System.out.println("multiplication of a,b=" + (a * b));

    }

    public static void division(int a, int b) {
        System.out.println("division ofa,b=" + (a/b));
    }
}

