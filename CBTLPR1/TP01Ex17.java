/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln. 
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex17 {
   public static void main( String[] args ) {
      double a,b,c= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva valor X que vai ser elevado por Y");
      a = s.nextDouble();
      System.out.println( "Escreva o valor Y que vai elevar X");
	  b = s.nextDouble();
	  for(int i=1;i<b;i++){
		  c+= Math.pow(a,a);
	  }
      System.out.println(a+" Elevado a "+b+" resulta em: "+c);
   }
}