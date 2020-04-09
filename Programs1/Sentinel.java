import java.util.Scanner;

public class Sentinel{

    public static void main(String []args){
        Scanner stdin = new Scanner(System.in);
        int input;
        // System.out.print("What are you looking for?")
        input = stdin.nextInt();
        while(input >= 0)
        {
            input = stdin.nextInt();
            if(input > 100)
            {
                System.out.print(input + " ");
            }
        }
    }
}