import java.io.*;
import java.util.*;

public class Pr2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in); 
        int x=scan.nextInt(); 
        if (x>=-100 || x<=100){ 
            String S=Integer.toString(x); 
            if (S.getClass().getSimpleName().equals("String")){ 
                System.out.println("Good job"); }
        }
    }
}
