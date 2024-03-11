import java.util.Scanner;

/* 
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/

class TP01Ex09 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double T,r,ce;
   System.out.println("Digite o valor da resistência: ");
   r = input.nextDouble();
   System.out.println("Digite o valor da corrente elétrica: ");
   ce = input.nextDouble();
   
   T = r * ce;
   
   System.out.println("O valor da tensão é de: "+T);
   
   input.close();
   
   
   }
}