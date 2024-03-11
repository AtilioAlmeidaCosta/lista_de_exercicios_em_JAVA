/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados. 
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex12 {
   public static void main( String[] args ) {
      double a,b,c= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva o valor da altura do cone");
      a = s.nextDouble();
	  System.out.println( "Escreva o valor do raio da base do cone");
	  b= s.nextDouble();
	  c= ((Math.PI*Math.pow(b,2)*a)/3);
      System.out.println("O volume do cone de altura "+a+" e raio da base "+b+" e: " +c);
   }
}