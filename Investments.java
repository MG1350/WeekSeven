import java.util.Scanner;

public class Investments
{
    public static void main (String args [])
    {
        double start = 2500;
        double end = 5000;
        int count = 0;
        while(start < end)
        {
            start = start * 1.075;
            count++;
        }
        System.out.println("Takes " + count + " years");
    }
}