
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
import static java.util.stream.Collectors.toSet;


public class Solution {
    static ArrayList<Integer> argsort(ArrayList<Double> src) {
        var sorted = new ArrayList<Double>(src);
        Collections.sort(sorted);
        var result = new ArrayList<Integer>();
        sorted.forEach(e -> {
            result.add(src.indexOf(e));
        }); 
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        var line = sc.nextLine();
        int n = Integer.parseInt(line);
        var names = new ArrayList<String>();
        var gpas = new ArrayList<Double>();
        while (n-- > 0) {
            var personGpa = sc.nextLine().split(" ");
            names.add(personGpa[1]);
            // System.out.println(personGpa);
            gpas.add(-Double.parseDouble(personGpa[2]));
        }
        var indexes = argsort(gpas);
        indexes.forEach(i -> System.out.println(names.get(i)));
        sc.close();
    }
}
