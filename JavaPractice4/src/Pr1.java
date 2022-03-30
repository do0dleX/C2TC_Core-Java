import java.io.*;
import java.util.*;

public class Pr1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int area;
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        if(b>0 && h>0){
            area=b*h;
            System.out.println(area);
        }
        else
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
