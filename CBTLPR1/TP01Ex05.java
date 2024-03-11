import java.util.Scanner;

/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.*/

class TP01Ex05 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double d,V,r;
   System.out.println("Digite o valor do diâmetro da esfera: ");
   d = input.nextDouble();
   
   r= d/2;
   V = (4.0/3.0) * 3.14 * r * r * r ;
   
   System.out.println("O volume da esfera é: "+V);
   
   input.close();
   
   
   }
}