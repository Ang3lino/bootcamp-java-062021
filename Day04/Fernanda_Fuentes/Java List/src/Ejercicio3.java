import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int N, Q;
        System.out.print("Ingrese el numero de elementos de la lista: ");
        N=entrada.nextInt();
        List<Integer> lista = new ArrayList<>();
    	System.out.print("Ingrese los numeros de la lista: ");
        for(int i = 0; i < N; i++) {
            lista.add(entrada.nextInt());
        }
    	System.out.print("Ingrese cuantas consultas: ");
        Q = entrada.nextInt();
        for(int i = 0 ; i < Q ; i++) {
        	System.out.print("Ingrese (Insert/Delete): ");
            switch(entrada.next()) {
                case "Insert":
                	System.out.print("Ingrese la posicion y el numero (pos, num): ");
                    lista.add(entrada.nextInt(), entrada.nextInt());
                    break;
                case "Delete":
                	System.out.print("Ingrese la posicion a eliminar: ");
                    lista.remove(entrada.nextInt());
            }
        }
    	System.out.print("Lista nueva: ");
        for(Integer e:lista) {
            System.out.print(e +", ");
        }
    }
}
