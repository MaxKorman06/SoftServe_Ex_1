import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class Main
{
    public static float doubleNumber(double number)
    {
        number = number * 2;
        return (float)number;
    }
    public static int sumOfDigits(int number)
    {
        int sum = 0;
        while(number != 0)
        {
            sum += (number % 10);
            number /=10;
        }
        return sum;
    }
    public static boolean isLeapYear(int year)
    {
        if (year % 100 == 0 && year % 400 != 0)
        {
            return false;
        }
        if (year % 4 == 0)
        {
            return true;
        }
        return false;
    }
    public static int century(int year)
    {
        int century  = (year / 100) + 1;
        if (year % 100 == 0)
        {
            century -= 1;
        }
        if (year == 0)
        {
            century = 0;
        }
        return century;
    }
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumOfDigits(scanner.nextInt()));
    }
}