package homeworkweek7;

/*15. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.*/
public class Question15 {
    public static void main(String[] args) {
        Question15 t = new Question15();
        t.lowercase();
    }
    public void lowercase() {
        Question15 t = new Question15();
        String Uppercase ="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String Lowercase=Uppercase.toLowerCase();
        System.out.println("sample input="+Uppercase);
        System.out.println("Output="+Lowercase);
    }



}
