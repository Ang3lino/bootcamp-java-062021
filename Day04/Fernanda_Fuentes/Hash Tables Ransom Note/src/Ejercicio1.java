import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void checkMagazine(List<String> revista, List<String> nota) {
    HashMap<String, Integer> map = new HashMap<>();
        
        for(String i : nota) {
            if(map.containsKey(i)) {
                int value = map.get(i);
                map.put(i, value += 1);
            }
            else map.put(i, 1);
        }
        
        for(String i : revista) {
            if(map.containsKey(i)) {
                int value = map.get(i);
                if(map.get(i) == 1) {
                    map.remove(i);
                }
                else map.put(i, value -= 1);
            }
        }
        
        String resultado = map.isEmpty() ? "Yes" : "No";
        System.out.println(resultado);

    }

    }


public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = leer.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> revista = Arrays.asList(leer.readLine().replaceAll("\\s+$", "").split(" "));

        List<String> nota = Arrays.asList(leer.readLine().replaceAll("\\s+$", "").split(" "));

        Result.checkMagazine(revista, nota);

        leer.close();
    }
}
