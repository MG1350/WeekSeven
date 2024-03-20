import java.util.Scanner;

public class NumbersSum
{
    public static void main (String args [])
    {
        int num;
        int lum = 0;
        int hold;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        hold = num;
        while (lum != hold)
        {
            total += num;
            lum += 1;
            System.out.println(lum);
            num -= 1;
        }
        System.out.println("Total - " + total);
    }
}