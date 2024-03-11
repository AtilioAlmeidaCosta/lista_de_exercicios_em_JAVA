import java.util.Scanner;

/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
*/

class TP01Ex02 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double A,a;
   System.out.println("Digite o valor da aresta: ");
   a = input.nextDouble();
   
   A = a*a;
   
   System.out.println("A área do quadrado é: "+A);
   
   input.close();
   
   
   }
}