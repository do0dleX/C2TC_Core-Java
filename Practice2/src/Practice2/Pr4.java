package Practice2;

import java.util.Scanner;

class Pr4 {

 public static void main(String args[])
 {

     Scanner scn = new Scanner(System.in);

     System.out.println("Enter an integer");
     System.out.println("Enter a String");
     int a = scn.nextInt();

     

     String b = scn.nextLine();

       System.out.printf("You have entered:- " + a + " "
                       + "and name as " + b);
 }
}
