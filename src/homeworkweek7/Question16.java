package homeworkweek7;

/*Write a Java Program to print as below. (All details to be stored in variable)

"+------------------------+"
"| |"
"| CORNER STORE |"
"| |"
"| 2015-03-29 04:38PM |"
"| |"
"| Gallons: 10.870 |"
"| Price/gallon: $ 2.89 |"
"| |"
"| Fuel total: $ 22.71 |"
"| |"
"+-------------------------------------------+"*/
public class Question16 {
    static String a ="CORNER STORE";
    static String b="2015-03-29 04:38PM"  ;
    static double c= 10.870;
    static String d="Price/gallon: $ 2.89";
    static String e="Fuel total: $ 22.71";

    public static void main(String[] args) {
        print();
    }
    public static void print(){
        System.out.println("\"+--------------------------+\"");
        System.out.println("\"|                          |\"");
        System.out.println("\"|     "+a+"         |\"");
        System.out.println("\"|                          |\"");
        System.out.println("\"|     "+b+"   |\"");
        System.out.println("\"|                          |\"");
        System.out.println("\"|   Gallons:+"+c+"         |\"");
        System.out.println("\"|     "+d+" |\"");
        System.out.println("\"|                          |\"");
        System.out.println("\"|     "+e+"  |\"");
        System.out.println("\"|                          |\"");
        System.out.println("\"+--------------------------+\"");

    }



}
