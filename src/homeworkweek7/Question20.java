package homeworkweek7;

/*20. Write a Java Program using below steps.
20.1 Declare your Spain as static variable.
20.2 Declare your United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.*/
public class Question20 {
    static String country1 ="Spain";
    String country2="United kingdom";

    public static void main(String[] args) {
        Question20 t=new Question20();
        t.homeCountry();
        holidays();
    }
    public void homeCountry(){
        Question20 t=new Question20();
        System.out.println(t.country1);


    }
    public static void holidays(){
        Question20 t=new Question20();
        System.out.println(t.country2);

    }
}

