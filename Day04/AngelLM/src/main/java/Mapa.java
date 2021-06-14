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


public class Mapa {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        var map = new HashMap<String, String>();
        var line = sc.nextLine();
        int n = Integer.parseInt(line);
        while (--n >= 0) {
            var k = sc.nextLine();
            var v = sc.nextLine();
            map.put(k, v);
        }

        while (sc.hasNextLine()) {
            var k = sc.nextLine();
            if (map.containsKey(k))
                System.out.printf("%s=%s\n", k, map.get(k));
            else
                System.out.printf("Not found\n");

        }
        sc.close();
    }
}
