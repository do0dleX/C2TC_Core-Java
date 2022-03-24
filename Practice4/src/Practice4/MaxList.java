package Practice4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class OP {

   
    public static int maxTickets(List<Integer> tickets) {
        
        Collections.sort(tickets);
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(tickets.get(0));
        for(int i=0;i < tickets.size()-1;i++){
            
                if( (tickets.get(i))-(tickets.get(i+1))==0 || (tickets.get(i))-(tickets.get(i+1)) == -1 ){
                     list2.add(tickets.get(i+1));
                }
                else{
                   list1.add(list2);
                    list2 = new ArrayList<Integer>();
                    list2.add(tickets.get(i));
                }
             
        }
        int max=0;
        for(List<Integer> i : list1){
            if(i.size()>max){
                max=i.size();
            }
        }
        return max;
       
    }

}
public class MaxList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int ticketsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> tickets = IntStream.range(0, ticketsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = OP.maxTickets(tickets);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}