import java.io.*;
import java.util.*;

public class Pr3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
String A=sc.next();
String B=sc.next();
System.out.println(A.length()+B.length());
System.out.println(A.compareTo(B)>0?"Yes":"No");
System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
    }
}
