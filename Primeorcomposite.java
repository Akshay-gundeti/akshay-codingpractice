import java.util.Scanner;

public class Primeorcomposite {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int c=0;
        if(n==0||n==1)
        {
            System.out.println("Not primenumber");
        }
        for(int i=2;i<n;i++) {
            if (n % i == 0) {
                c = 1;
                break;
            }
        }
            if(c==0)
            {
                System.out.println("Prime number");
            }
            else
            {
                System.out.println("Composite");
            }
        }

}
