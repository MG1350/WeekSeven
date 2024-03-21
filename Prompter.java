import java.util.Scanner;

public class Prompter
{
    public static void main (String args [])
    {
        int min;
        int max;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a min number: ");
        min = input.nextInt();
        System.out.print("Enter a max number: ");
        max = input.nextInt();
        boolean done = true;
        while (done)
        {
            System.out.print("Enter a number between " + min + " " + max + ": ");
            temp = input.nextInt();
            if(min < temp && temp <max)
            {
                done = false;
                input.close();
            }
        }
    }
}