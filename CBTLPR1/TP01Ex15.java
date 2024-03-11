/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). 
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex15 {
   public static void main( String[] args ) {
      double a,b,c= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva valor da cotacao do dolar para o real");
      a = s.nextDouble();
      System.out.println( "Escreva o valor a ser convertido de dolar para real");
	  b = s.nextDouble();
	  c = a*b;
      System.out.println("O valor de $"+b+" para real a uma taxa de "+a+" vai ser de: R$"+c);
   }
}