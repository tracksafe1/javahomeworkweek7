package homeworkweek7;

/*17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
public class Question17 {
    String city="London";
    static String  country="UK";

    public static void main(String[] args) {
        Question17 t=new Question17();
        prog1();
        t.prog();
    }
    public void prog(){
        Question17 t=new Question17();

        System.out.println("COUNTRY="+country);
    }
    public static void prog1(){
        Question17 t=new Question17();
        System.out.println("CITY="+t.city);
    }
}

