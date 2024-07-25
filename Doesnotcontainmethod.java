import java.util.Scanner;

public class Doesnotcontainmethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sn="Revature Program";
        System.out.println("Enter the string to check whether it contains this string or not");
        String str=s.nextLine();
        if(!(sn.contains(str)))
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("yes");
        }
    }
}
