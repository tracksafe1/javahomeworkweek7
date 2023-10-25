package homeworkweek7;

/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:

Width = 5.6 Height = 8.5

Expected Outp

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
public class Question13 {



    public static void main(String[] args) {
        rectangle(5.6f,8.5f);

    }
    public static void rectangle(float width,float Height){
        System.out.println("Area of rectangle="+(width*Height));
        System.out.println("perimeter of rectangle= "+(2*(width+Height)));
    }
}

