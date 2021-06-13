import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio5 {

 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el numero de pares: ");
        int t;
        t = entrada.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            System.out.print("Ingrese el nombre de los pares: ");
            pair_left[i] = entrada.next();
            pair_right[i] = entrada.next();
        }

        HashSet<String> pares = new HashSet<>();
        for(int i = 0; i < t; i++){
            pares.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(pares.size());
        }

    }
}