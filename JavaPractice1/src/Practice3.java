import java.io.*;
import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n%2==0){
            if(n<=5){
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        else{System.out.println("Invalid number");}
    }
}
