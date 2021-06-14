import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Comparator;

public class Linked {
    public static void main(String[] args) {
LinkedList<String> list = new LinkedList<>();
        list.add("Pedro");
        list.add("Raul");
        list.add("Luis");
        list.add("Pepe");
        list.add("Ramon");

        System.out.println("LinkedList: "+ list  );
        int index = 3;
        System.out.println("Remove one value in the middle of the list");
        list.remove(index);
        System.out.println("New List: "+ list );
        System.out.println("Insert on value in the middle of the list");
        list.add(index, "Carlos");
        System.out.println("New LinkedList: "+ list );

        //Iterating
        System.out.println("Iterating the LinkedList");       
        System.out.println("Using Iterator Class");
        
        ListIterator it2 = list.listIterator();

        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }

        System.out.println("Usiong .forEaach method");
        list.forEach(
            (element) -> System.out.print(element + " ")
        );

        System.out.println("");
        System.out.println("Using For Each loop");
        for (String listElement : list) {
            System.out.print(listElement+ " ");
        }

        System.out.println("");
        System.out.println("Using While loop");
        int j=0;
        while(j<list.size()){
            System.out.print(list.get(j) + " ");
            j++;
        }


        System.out.println("");
        System.out.println("SORT ARRAYLIST");//For this method to be used, we need to have our ubject implementing the comparable class
        Collections.sort(list);
        System.out.println(list);

        System.out.println("SORT IN REVERSE ORDER");//For this method to be used, we need to have our ubject implementing the comparable class
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
