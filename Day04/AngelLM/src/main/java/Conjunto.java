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


public class Conjunto {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        var line = sc.nextLine();
        int n = Integer.parseInt(line);
        var set = new HashSet<String>();
        var result = new ArrayList<Integer>();
        while (n-- > 0) {
            line = sc.nextLine();
            set.add(line);
            result.add(set.size());
        }
        result.forEach(x -> System.out.println(x));
        sc.close();
    }
}
