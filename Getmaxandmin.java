import java.util.Arrays;
import java.util.Scanner;

public class Getmaxandmin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s.nextInt();

        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Min"+a[0]+"max"+a[n-1]);


    }
}
