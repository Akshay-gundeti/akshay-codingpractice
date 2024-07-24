import java.util.Scanner;

public class Greaterorlesser {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int temp=(a>b?a:b);
        int largest=(temp>c?temp:c);
        int sma=(a<b?a:b);
        int smallest=(sma<c?sma:c);
        System.out.println(smallest);
        System.out.println(temp);

    }
}
