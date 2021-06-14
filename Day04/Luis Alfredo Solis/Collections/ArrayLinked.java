import java.util.*;

class ArrayLinked { 


    public static void main(String []args){

        //This is the way that we can use to add to list. In both the function had the same name.

        System.out.println("");


        ArrayList<String> array = new ArrayList<>();
        array.add("Jaime-array");
        array.add("Eduardo-array");
        array.add("Value-array");
        array.add("Torres-array");
        array.add("Hurtado-array");

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Jaime-linked");
        linked.add("Eduardo-linked");
        linked.add("Value-linked");
        linked.add("Torres-linked");
        linked.add("Hurtado-linked");

        System.out.println("Original ArrayList : "+ array  );
        int middleValueArray = (int) array.size() /2 ;
        array.remove(middleValueArray);
        System.out.println("Remove middle value");
        System.out.println("Modified ArrayList : "+ array );
        System.out.println("Insert value in the middle");
        array.add(middleValueArray, "Value-array");
        System.out.println("Modified ArrayList : "+ array );

        System.out.println("Iterating the array");

        System.out.println("Way 1");
        Iterator it = array.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println("");
        System.out.println("Way 2");
        array.forEach(
            (element) -> System.out.print(element + " ")
        );

        System.out.println("");
        System.out.println("Way 3");
        for (String listElement : array) {
            System.out.print(listElement+ " ");
        }

        System.out.println("");
        System.out.println("Way 4");
        int i=0;
        while(i<array.size()){
            System.out.print(array.get(i) + " ");
            i++;
        }


        System.out.println("");
        System.out.println("SORT ARRAYLIST");
        Collections.sort(array);
        System.out.println(array);
        System.out.println("SORT IN REVERSE ORDER");
        array.sort(Comparator.reverseOrder());
        System.out.println(array);

        System.out.println("-----------------------------------------------------");

        System.out.println("Original LinkedList : "+ linked  );
        int middleValueLinked = (int) linked.size() /2 ;
        linked.remove(middleValueLinked);
        System.out.println("Remove middle value");
        System.out.println("Modified LinkedList : "+ linked );
        System.out.println("Insert value in the middle");
        linked.add(middleValueLinked, "Value-linked");
        System.out.println("Modified LinkedList : "+ linked );

        System.out.println("");
        System.out.println("");


        System.out.println("Iterating the LinkedList");
        System.out.println("Way 1");
        // Iterator it2 = linked.listIterator();
        ListIterator it2 = linked.listIterator();

        while(it2.hasNext()){
            System.out.print(it2.next() + " ");
        }

        System.out.println("");
        System.out.println("Way 2");
        linked.forEach(
            (element) -> System.out.print(element + " ")
        );

        System.out.println("");
        System.out.println("Way 3");
        for (String listElement : linked) {
            System.out.print(listElement+ " ");
        }

        System.out.println("");
        System.out.println("Way 4");
        int j=0;
        while(j<linked.size()){
            System.out.print(linked.get(j) + " ");
            j++;
        }


        System.out.println("");
        System.out.println("SORT ARRAYLIST");
        Collections.sort(linked);
        System.out.println(linked);

        System.out.println("SORT IN REVERSE ORDER");
        linked.sort(Comparator.reverseOrder());
        System.out.println(linked);

    }
}