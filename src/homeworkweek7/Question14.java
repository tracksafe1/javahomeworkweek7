package homeworkweek7;

/*14. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
public class Question14 {
    public static void main(String[] args) {
        maths(125,24);
    }

    public static void maths(int a,int b){
        System.out.println("sum of a and b="+(a+b));
        System.out.println("difference of a and b="+(a-b));
        System.out.println("multiply a and b="+(a*b));
        System.out.println("divide a by b="+(a/b));
        System.out.println("mod of aand b="+Math.floorMod(a, b));
    }
}

