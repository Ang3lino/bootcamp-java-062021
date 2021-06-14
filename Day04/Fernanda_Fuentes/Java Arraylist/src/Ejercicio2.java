// Se usan ArrayList para almacenar datos enteros
// El try catch comprueba si el numero esta en el Array o no
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.print("Cuantas lineas son: ");
        n = entrada.nextInt();
        
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d;
            System.out.print("Ingrese los numeros separados por un espacio: ");
            d = entrada.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                row.add(entrada.nextInt());
            }
            
            rows.add(row);
        }
        
        int q;
        System.out.print("Ingrese el numero de consultas que se haran: ");
        q = entrada.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x;
            System.out.print("Ingrese la columna: ");
            x = entrada.nextInt();
            int y;
            System.out.print("Ingrese la fila: ");
            y = entrada.nextInt();
            
            try {
                System.out.println("El numero es: "+rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
