import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HashMapProblem {
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
        Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        Map<String, Integer> noteMap = new HashMap<String, Integer>();

        for(String word: magazine){
            if (!magazineMap.containsKey(word)) magazineMap.put(word, 0);
            magazineMap.put(word, magazineMap.get(word) + 1);
        }

        for(String word: note){
            if (!noteMap.containsKey(word)) noteMap.put(word, 0);
            noteMap.put(word, noteMap.get(word) + 1);
        }
        boolean flag = true;
        for(String key: noteMap.keySet()){
            if (!magazineMap.containsKey(key)) flag = false;
            int needed = noteMap.get(key);
            try {
                if (magazineMap.get(key) < needed) flag = false;
            } catch (Exception e) {
                flag = false;
            }
            
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        List<String> note = Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "));

        HashMapProblem.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}