import java.util.Scanner;

public class Digits_Sum
{
    public static void main (String args [])
    {
        int num;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        int ones = num % 10;
        int tens = num % 100 - ones;
        int hundreds = num % 1000 - tens - ones;
        int hund = 0;
        int tend = 0;
        while (hundreds != 0)
        {
            hundreds = hundreds - 100;
            hund = hund + +1;
        }
        while (tens != 0)
        {
            tens = tens - 10;
            tend = tend + +1;
        }
        total = tend + hund + ones;
        System.out.println("Total is " + total);
    }
}