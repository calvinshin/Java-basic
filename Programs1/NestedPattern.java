import java.util.Scanner;

public class NestedPattern
{
    public static void main(String[] args)
    {
        for (int row = 7; row > 0; row--)
        {
            for (int column = 0; column < row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}