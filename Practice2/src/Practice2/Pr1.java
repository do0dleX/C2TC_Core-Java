package Practice2;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pr1 {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Scanner scan = new Scanner(System.in); 
        
        String one = bufferedReader.readLine();
        String two = scan.next();
        
        String Result1 = one.toLowerCase();
        String Result2 = two.toUpperCase();
        
        System.out.println(Result1);
        System.out.println(Result2);
	}

}
