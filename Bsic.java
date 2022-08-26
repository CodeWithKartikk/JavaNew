import javax.swing.SingleSelectionModel;

public class MainClass {
    public static void main(String[] args) {

        // 1. Output or Printing
        // System.out.println("Hello, Sanvi"); // 1st way - println() -> print in next
        // System.out.println("Hello, Sanvi"); // 1st way - println() -> print in next
        // System.out.println("Hello, Sanvi"); // 1st way - println() -> print in next

        // System.out.print("Hello, Sanvi ");
        // System.out.print("Hello, Sanvi ");
        // System.out.print("Hello, Sanvi");

        // 2. Java Comments
        // SingleLineComment
        /*
         * Multi
         * Line
         * Comment
         */

        // Variables
        // Types - String, int, float, char, boolean
        // dataType variableName = value ->Syntax

        // "" -> Strings
        String empName = "Sanvi";
        System.out.println(empName);

        // int variable
        int a = 9;
        System.out.println(a);

        // float Variable
        float floatVar = 4.55f;
        System.out.println(floatVar);

        // Code for Simple Interest
        float p = 50000f;
        float r = 10.45f;
        int t = 10;
        float si = p * r * t / 100;
        System.out.println(si);

        // char Variable
        char ch = 'a';
        System.out.println(ch);

        // Boolean Variable (True/False)
        boolean b = true;
        System.out.println(b);
    }
}
