import java.util.Scanner;

/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
*/ 

class TP01Ex06 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double v1,v2,v3,v4, MA;
   System.out.println("Digite o primeiro valor : ");
   v1 = input.nextDouble();
   System.out.println("Digite o segundo valor : ");
   v2 = input.nextDouble();
   System.out.println("Digite o terceiro valor : ");
   v3 = input.nextDouble();
   System.out.println("Digite o quarto valor : ");
   v4 = input.nextDouble();
   
   MA = (v1+v2+v3+v4)/4;
   System.out.println("A média aritmética é: "+MA);
   
   input.close();
   
   
   }
}