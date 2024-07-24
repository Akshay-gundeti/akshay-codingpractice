import java.util.*;
public class hectooct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String hex=s.nextLine();
       int dec=Integer.parseInt(hex,16);
       String octal=Integer.toOctalString(dec);
        System.out.println(octal);
    }
}
