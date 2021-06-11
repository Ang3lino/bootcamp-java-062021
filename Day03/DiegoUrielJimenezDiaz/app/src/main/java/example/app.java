package example;

import ejemplo.Utilidades;

public class app {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    int number = 10;
    if(Utilidades.isEven(number)){
      System.out.println("Es par");
    }else{
      System.out.println("Es impar");
    }
  }
}
