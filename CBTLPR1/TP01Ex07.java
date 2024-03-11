import java.util.Scanner;

/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
7.Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados. 
*/

class TP01Ex07 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double v1,v2,MG;
   System.out.println("Digite o primeiro valor : ");
   v1 = input.nextDouble();
   System.out.println("Digite o segundo valor : ");
   v2 = input.nextDouble();
   
   
   MG = Math.sqrt(v1*v2);
   System.out.println("A média geométrica é: "+MG);
   
   input.close();
   
   
   }
}