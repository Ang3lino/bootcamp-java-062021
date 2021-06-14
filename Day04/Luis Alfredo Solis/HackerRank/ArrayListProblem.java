import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListProblem {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int arrayNumber = sc.nextInt();
        sc.nextLine();
        List<String[]> arrays= new ArrayList<>(arrayNumber);
        
        for (int i = 0; i < arrayNumber; i++) {
            arrays.add(sc.nextLine().replaceAll("\\s+$", "").split(" "));
        }
        
        int queriesNumber = sc.nextInt();
        sc.nextLine();
        List<String[]> queries = new ArrayList<>(queriesNumber);
        
        for (int i = 0; i < queriesNumber; i++) {
            queries.add(sc.nextLine().replaceAll("\\s+$", "").split(" "));
        }
        
        for (String[] query : queries) {
            if(Integer.parseInt(query[0]) > arrayNumber){
                System.out.println("ERROR!");
            }
            else{
                String[] temp = arrays.get(Integer.parseInt(query[0]) - 1);
                if(Integer.parseInt(query[1]) > temp.length - 1){
                    System.out.println("ERROR!");
                }else{
                    System.out.println(temp[Integer.parseInt(query[1])]);
                }
            
            }
        }
    }
}