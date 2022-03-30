import java.util.*;

public class Pr1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i;
        double j;
        String k;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextDouble();
        sc.nextLine();
        k=sc.nextLine();
        sc.close();
        System.out.println("String: "+k);
        System.out.println("Double: "+j);
        System.out.println("Int: "+i);
    }
}
