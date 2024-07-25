import java.util.Scanner;

public class Containsmethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String n="Welcome to Revature Readiness Program";
        System.out.println("Enter string name to check whether it contains in the string");
        String str=s.nextLine();
        System.out.println(n.contains(str));


    }
}
