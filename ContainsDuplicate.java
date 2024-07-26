import java.util.Arrays;
import java.util.Scanner;

public class ContainsDuplicate {
    static boolean dup(int [] a,int n)
    {
        Arrays.sort(a);
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(dup(a,n));
    }
}
