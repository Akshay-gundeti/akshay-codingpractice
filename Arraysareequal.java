import java.util.Arrays;
import java.util.Scanner;

public class Arraysareequal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elemnets in first array");
        int n=s.nextInt();
        System.out.println("Enter number of elemnets in second array");
        int n1=s.nextInt();
        int [] a=new int[n];
        int [] b=new int[n1];
        System.out.println("enter elements of first array");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter elements of second array");
        for(int j=0;j<n1;j++)
        {
            b[j]=s.nextInt();
        }
        System.out.println(Arrays.equals(a,b));
    }
}
