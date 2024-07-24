import java.util.Scanner;

public class octatohexa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n=s.next();
        int dec=Integer.parseInt(n,8);
        String hexnum=Integer.toHexString(dec);
        System.out.println(hexnum);

    }
}
