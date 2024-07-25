import java.util.Scanner;

public class indexofmethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //indexof four methods
        String str=s.nextLine();
        //returns starting index of string
        System.out.println("Enter the string to find index");
        String s1=s.nextLine();
        System.out.println(str.indexOf(s1));
        //return index of char from specified string
        System.out.println(str.indexOf('r',8));
        System.out.println(str.indexOf('o'));
    }
}
