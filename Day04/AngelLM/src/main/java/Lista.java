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


public class Lista {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        var array = new ArrayList<Integer>();
        // here you read N... omit

        // build L
        line = bufferedReader.readLine().split(" ");
        for (var x: line) 
            array.add(Integer.parseInt(x));

        line = bufferedReader.readLine().split(" ");
        int q = Integer.parseInt(line[0]);
        while (--q >= 0)  {
            line = bufferedReader.readLine().split(" ");
            if (line[0].contains("Insert")) {
                line = bufferedReader.readLine().split(" ");
                int p = Integer.parseInt(line[0]), e = Integer.parseInt(line[1]);                
                if (p == array.size())
                    array.add(e);
                else 
                    array.add(p, e);
            } else {
                line = bufferedReader.readLine().split(" ");
                int p = Integer.parseInt(line[0]);
                array.remove(p);
            }
        }

        array.forEach(x -> System.out.print(x + " "));
        bufferedReader.close();
    }
}
