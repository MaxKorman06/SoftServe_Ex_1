import java.io.IOException;
import java.util.Scanner;

public class Main
{
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
        System.out.println(century(scanner.nextInt()));
    }
}