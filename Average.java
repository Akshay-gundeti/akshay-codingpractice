import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int[] arr=new int[20];
        System.out.println("Enter number of elements");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println(avg);
    }
}
