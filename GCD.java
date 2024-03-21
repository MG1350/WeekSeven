import java.util.Scanner;

public class GCD
{
    public static void main (String args [])
    {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = input.nextInt();
        System.out.print("Enter a number: ");
        b = input.nextInt();
        input.close();
        {
            while (a != 0 && b != 0)
            {
                if (a >= b)
                {
                    a = a - b;
                }
                else
                    b = b - a;
            }
            if (a == 0) System.out.print("GCD: " + b);
            else System.out.print("GCD: " + a);
        }
    }
}