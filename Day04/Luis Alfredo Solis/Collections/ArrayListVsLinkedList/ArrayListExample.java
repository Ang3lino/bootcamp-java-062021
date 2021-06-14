import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;


public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Pedro");
        array.add("Raul");
        array.add("Luis");
        array.add("Pepe");
        array.add("Ramon");

        int remove = 3 ; //The 3rd element on the array is the one to set to be removed
        array.remove(remove); //Remove element
        array.add(remove, "Carlos"); //Add element in the middle
        System.out.println("Modified ArrayList: "+ array );
        
        //Iterations
        System.out.println("Iterating the array");
                
        System.out.println("Using For Each Array method");
        array.forEach(
            (element) -> System.out.print(element + " ")
        );

        System.out.println("Using For Each");
        for (String listElement : array) {
            System.out.print(listElement+ " ");
        }

        System.out.println("Using Iterator Class");
        Iterator it = array.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println("");
        System.out.println("Using while loop");
        int i=0;
        while(i<array.size()){
            System.out.print(array.get(i) + " ");
            i++;
        }


        //Sorting
        System.out.println("SORT ARRAYLIST (Collections.sort method)"); //For this method to be used, we need to have our ubject implementing the comparable class
        Collections.sort(array);
        System.out.println(array);
        System.out.println("SORT IN REVERSE ORDER (Collections.sort method)");//For this method to be used, we need to have our ubject implementing the comparable class
        array.sort(Comparator.reverseOrder());
        System.out.println(array);

    }
}
