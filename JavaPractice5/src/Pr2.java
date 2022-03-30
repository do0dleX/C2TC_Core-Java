import java.io.*;
import java.util.*;

public class Pr2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    String r = "";
    Scanner sc = new Scanner(System.in);
    String s = sc.next(); 

    for(int i= s.length() - 1;i>=0;i--) {
        r = r + s.charAt(i);
    }

    if(r.equals(s)) {
        System.out.println("Yes");
    }
    else {
        System.out.println("No");
    }
    }
    
}
