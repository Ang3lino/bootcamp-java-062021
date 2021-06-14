import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> tree = new TreeMap<Integer, String>();

        tree.put(1, "Juan");
        tree.put(2, "Pedro");
        tree.put(3, "Pepe");
        tree.put(4, "Luis");
        tree.put(5, "Alfredo");

        System.out.println("Looking for an object:");
        System.out.println(tree.get(4));

        System.out.println("Removing an object:");
        tree.remove(5);
        System.out.println(tree);

        System.out.println("Iterating a tree using Iterator class:");
        Iterator it = tree.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next(); 
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
