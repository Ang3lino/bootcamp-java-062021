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

class Result {

    public static HashMap<String, Integer> WordCounter(List<String> src) {
        var keys = new HashSet<String>(src);
        var result = new HashMap<String, Integer>();
        keys.forEach(k -> result.put(k, Collections.frequency(src, k)) );
        return result;
    }

    public static boolean isPossible(HashMap<String, Integer> counter, List<String> note) {
        for (var word: note) {
            if (counter.containsKey(word)) {
                var count = counter.get(word) - 1;
                if (count == 0)
                    counter.remove(word);
                else 
                    counter.replace(word, count);
            } else     
                return false;
        }
        return true;
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        var counter = WordCounter(magazine);
        var str = isPossible(counter, note) ? "Yes" : "No";
        System.out.println(str);
    }

}

public class Ransom {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
