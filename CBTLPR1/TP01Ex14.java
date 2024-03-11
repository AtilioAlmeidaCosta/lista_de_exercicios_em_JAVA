/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
*r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão
*digitados.
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex14 {
   public static void main( String[] args ) {
      double a,b,c,d,e= 0;
      Scanner s = new Scanner( System.in );
      System.out.println("Escreva valor da aresta do cubo perfeito");
      a = s.nextDouble();
      System.out.println("Escreva o valor do raio da esfera");
	  b = s.nextDouble();
	  c = Math.pow(a,3);
	  d = ((Math.PI*4*(Math.pow(b,3))/4));
	  e = (c-d);
      System.out.println("O valor do volume livre resultante e: "+e);
   }
}