import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int a=0;
        int b=1;
        int temp;
        int count=2;
        System.out.println(a);
        System.out.println(b);
        while(count<=n)
        {
            temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);
            count++;
        }


    }
    }
