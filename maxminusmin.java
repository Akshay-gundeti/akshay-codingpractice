import java.util.*;
public class maxminusmin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of Elements");
        int n=s.nextInt();
        int [] a=new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int min=a[0];
        int max=a[n-1];
        int dif=max-min;
        System.out.println(dif);
    }
}
