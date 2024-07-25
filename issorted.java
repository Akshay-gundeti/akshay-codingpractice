import java.util.Scanner;

public class issorted {
    static boolean issort(int a[],int n)
    {
        if(n==1||n==0)
        return true;
        return a[n-1]>=a[n-2] && issort(a,n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        if(issort(a,n))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
