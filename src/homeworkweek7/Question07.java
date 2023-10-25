package homeworkweek7;


/*Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class Question07 {
    static float F=37;//temp in farenheit
    static double temp=((F-32)*5/9);


    public static void main(String[] args) {

        converting();
    }
    public static void converting(){
        System.out.println("temperature in celcius"+temp+"℃");
    }
}

