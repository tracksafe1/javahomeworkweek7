package homeworkweek7;

/*19. Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
public class Question19 {
    String membername1="Kinjal Shah";
    static String membername2="Ripti Patel";

    public static void main(String[] args) {
        Question19 t=new Question19();
        String membername3="Khushbu";
        System.out.println(membername3);
        t.code1();
        agile();




    }
    public void code1(){
        String name="Avani";
        Question19 t=new Question19();
        System.out.println(membername1);
        System.out.println(t.membername2);
        System.out.println(name);



    }
    public static void agile(){
        String name="Nayan";
        Question19 t=new Question19();
        System.out.println(t.membername1);
        System.out.println(membername2);
        System.out.println(name);
    }
}

