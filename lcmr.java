import java.util.Scanner;

public class lcmr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int max=(a>b)?a:b;
        while(true)
        {
            if((max%a==0)&&(max%b==0))
            {
                System.out.println(max);
                break;
            }
            ++max;
        }

    }
}
