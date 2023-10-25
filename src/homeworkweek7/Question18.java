package homeworkweek7;

/*18.1 Declare your council name as static variables.
        18.2 Declare your house number as instance variables.
        18.3 Declare one instance method name borough() and call Static variable
        18.4 Declare static method name address() and call instance variable
        18.5 Call both user defined methods into main method*/
public class Question18 {
    int Houseno=44;
    static String council ="Hertfordshire";

    public static void main(String[] args) {
        Question18 t=new Question18();
        address();
        t.borough();

    }
    public void borough(){
        Question18 t=new Question18();
        System.out.println("Council="+council);
    }
    public static void address(){
        Question18 t=new Question18();
        System.out.println("House no="+t.Houseno);
    }
}
