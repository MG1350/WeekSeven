import java.text.NumberFormat;
import java.util.Scanner;

public class Grades
{
    public static void main (String args [])
    {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        grade = input.nextInt();
        input.close();
        if (grade >= 95)
        {
            System.out.println("A");
        }
        else if (grade >= 90)
        {
            System.out.println("B");
        }
        else if (grade >= 85)
        {
            System.out.println("C");
        }
        else if (grade >= 80)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}