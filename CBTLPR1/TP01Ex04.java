import java.util.Scanner;

/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/ 

class TP01Ex04 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double A,B,h;
   System.out.println("Digite o valor da base do triângulo: ");
   B = input.nextDouble();
   System.out.println("Digite o valor da altura do triângulo: ");
   h = input.nextDouble();
   
   A = (B*h)/2;
   System.out.println("A área do triângulo é: "+A);
   
   input.close();
   
   
   }
}