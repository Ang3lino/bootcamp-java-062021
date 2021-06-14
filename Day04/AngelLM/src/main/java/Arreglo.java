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


public class Arreglo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        var holder = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; ++i) {
            String[] line = bufferedReader.readLine().split(" ");
            int d = Integer.parseInt(line[0]);
            holder.add(new ArrayList<Integer>());
            for (int j = 0; j < d; ++j) 
                holder.get(i).add(Integer.parseInt(line[j + 1]));
        }

        // System.out.println(holder);
        String[] line = bufferedReader.readLine().split(" ");
        int q = Integer.parseInt(line[0]);
        var coordinates = new ArrayList<ArrayList<Integer>>();  
        while (--q >= 0) {
            line = bufferedReader.readLine().split(" ");
            var coor = new ArrayList<Integer>();
            coor.add(Integer.parseInt(line[0]));
            coor.add(Integer.parseInt(line[1]));
            coordinates.add(coor);
        }

        for (var coor: coordinates) {                
            int x = coor.get(0) - 1, y = coor.get(1) - 1;
            try {
                System.out.println(holder.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        bufferedReader.close();
    }
}
