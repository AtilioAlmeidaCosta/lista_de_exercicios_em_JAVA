/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex16 {
   public static void main( String[] args ) {
      double a,b,c,d,e= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva em graus o valor do angulo desejado");
      a = s.nextDouble();
	  a= Math.toRadians(a);
	  b = Math.sin(a);
	  c= Math.cos(a);
      d= Math.tan(a);
	  e=(1/c);
      System.out.println("Aqui estao algumas informacoes sobre o angulo de "+a);
	  System.out.println("Seno: "+b);
	  System.out.println("Cosseno: "+c);
	  System.out.println("Tangente "+d);
	  System.out.println("Secante "+e);
	  }
}