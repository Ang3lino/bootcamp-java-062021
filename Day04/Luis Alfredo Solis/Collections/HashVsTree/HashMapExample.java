package B;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        hash.put(1, "Juan");
        hash.put(2, "Pedro");
        hash.put(3, "Pepe");
        hash.put(4, "Luis");
        hash.put(5, "Alfredo");

        System.out.println("Looking for an object:");
        System.out.println(hash.get(2));


         
        System.out.println("Removing an object:");
        hash.remove(3);
        System.out.println(hash); 


        System.out.println("Iterating a hash using Iterator class:");
        Iterator it = hash.entrySet().iterator(); 
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue()); 
        }
    }
}
