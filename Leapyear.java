import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int year=input.nextInt();
        if((((year % 4) == 0) && ((year % 400) == 0)) || ((year % 100) != 0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not an Leap Year");
        }

    }
}
