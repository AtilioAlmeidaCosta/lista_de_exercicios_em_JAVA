/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. 
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex13 {
   public static void main( String[] args ) {
      double a,b,c,d= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva valor da velocidade inicial em m/s");
      a = s.nextDouble();
      System.out.println( "Escreva o valor da aceleracao em m/s²");
	  b = s.nextDouble();
      System.out.println( "Escreva o valor do tempo em segundos");
	  c = s.nextDouble();
	  d = (a+(b*c));
      System.out.println("O valor da velocidade final e de: "+d+"(m/s)");
   }
}