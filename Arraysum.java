import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] sum=new int[20];
        System.out.println("Enter number of elements to find sum");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            sum[i]=s.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c+=sum[i];
        }
        System.out.println(c);

    }
}
