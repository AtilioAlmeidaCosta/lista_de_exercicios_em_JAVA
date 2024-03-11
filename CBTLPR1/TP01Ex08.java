import java.util.Scanner;

/*
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.*/

class TP01Ex08 {
   public static void main (String[] args){
  Scanner input = new Scanner(System.in);   
  
  Double M,KM;
   System.out.println("Digite o número de milhas: ");
   M = input.nextDouble();
   
   KM=M*1.852;
   System.out.println("O resultado da conversão de milhas para KM: "+KM);
   
   input.close();
   
   
   }
}