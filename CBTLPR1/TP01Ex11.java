/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex11 {
   public static void main( String[] args ) {
      double a,b= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva o diametro do circulo");
      a = s.nextDouble();
      b=(Math.PI*(Math.pow((a/2),2)));
      System.out.println("A area do circulo de diametro "+a+" vai ser: " +b);
   }
}