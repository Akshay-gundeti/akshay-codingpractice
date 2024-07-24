import java.util.Scanner;

public class gcdr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int gcd=0;
        for(int i=1;i<=a && i<=b;++i)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
