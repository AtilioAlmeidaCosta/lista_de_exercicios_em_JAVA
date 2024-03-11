import java.util.Scanner;

/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
*/

class TP01Ex03 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
   Double A,d;
   System.out.println("Digite o valor da diagonal do quadrado: ");
   d = input.nextDouble();
  
   
   A = (d*d)/2;
   System.out.println("A área do quadrado é: "+A);
   
   input.close();
   
   
   }
}