import java.util.*;
import java.io.*;

public class Ejercicio4 {
	public static void main(String []argh)
	{
System.out.println("Directorio \n");
        Map<String, Integer> mapa = new HashMap<>();
		Scanner entrada = new Scanner(System.in);
		int n, telefono;
		String nombre, s;
		
		System.out.print("Ingrese el numero de personas: ");
		n = entrada.nextInt();
		entrada.nextLine();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Ingresa el nombre: ");
			nombre = entrada.nextLine();
			System.out.print("Ingresa el numero: ");
			telefono = entrada.nextInt();
			entrada.nextLine();
            mapa.put(nombre, telefono);
		}
		System.out.print("\nBusqueda en el directorio ");
		while(entrada.hasNext())
		{
			s= entrada.nextLine();
            if(mapa.containsKey(s))
                System.out.println(s+ " = "+ mapa.get(s));
            else
                System.out.println("Not found");
		}
	}
}
