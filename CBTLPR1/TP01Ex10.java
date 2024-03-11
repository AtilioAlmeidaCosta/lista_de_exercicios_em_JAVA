/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. 
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex10 {
   public static void main( String[] args ) {
      double a,b= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva quantos graus Celsius deseja converter para Fahrenheit");
      a = s.nextDouble();
      b=((a*1.8)+32);
      System.out.println(a+" graus Celsius para Fahrenheit deu: " +b);
   }
}