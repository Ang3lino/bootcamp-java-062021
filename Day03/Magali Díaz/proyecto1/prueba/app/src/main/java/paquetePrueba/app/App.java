/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package paquetePrueba.app;

import org.apache.commons.text.WordUtils;

public class App {
       public static void main(String[] args) {
            if(paquetePrueba.utilities.FuncsMateSimples.esDivisor(2,10));
            System.out.println("2 es divisor de 10");

            System.out.println("El divisor positivo más pequeño entre 33 y 99 es: "
                    +paquetePrueba.utilities.FuncsMateSimples.divPeq(33,99));
            System.out.println("El divisor positivo más grande entre 33 y 99 es: "
                    +paquetePrueba.utilities.FuncsMateSimples.divGra(33,99));
        }

}
