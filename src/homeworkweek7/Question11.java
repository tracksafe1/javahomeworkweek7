package homeworkweek7;

/*11. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889*/
public class Question11 {
    double a=25.5;
    static  double b=3.5;
    static double c=40.5;
    double d=4.5;
    public static void main(String[] args) {
        Question11 t=new Question11();
        t. bodmas();
    }
    public void bodmas(){

        Question11 t=new Question11();
        System.out.println((a*b-b*b)/(c-d));
    }
}

