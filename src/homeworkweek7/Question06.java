package homeworkweek7;

/*6. Write a program to enter any radius value of the circle and find out the area. (Formula
of Area A=PI*r*r).*/
    public class Question06 {
        float r=14;
        float pie=22/7;



        public static void main(String[] args) {
            Question06 t=new Question06();
            t.area();


        }
        public void area(){
            Question06 t=new Question06();
            System.out.println(pie*t.r*t.r);

        }

    }


