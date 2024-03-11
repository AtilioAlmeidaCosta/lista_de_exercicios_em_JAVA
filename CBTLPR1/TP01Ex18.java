/**
Autores: Atilio Almeida Costa & Jula Lemos
ADS 371 2024
18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.  
*/
import java.lang.*;
import java.util.Scanner;
class TP01Ex18 {
   public static void main( String[] args ) {
      double a,b,c,d,e,f,g,h= 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Escreva valor do primeiro produto");
      a = s.nextDouble();
      System.out.println( "Escreva valor do segundo produto");
      b = s.nextDouble();
	  System.out.println( "Escreva valor do terceiro produto");
      c = s.nextDouble();
      System.out.println( "Escreva valor do quarto produto");
      d = s.nextDouble();
	  System.out.println( "Escreva valor do quinto produto");
      e = s.nextDouble();
	  f = (a+b+c+d+e);
      System.out.println( "O valor total a ser pago e:"+f);
	  System.out.println( "Digite o valor que voce vai pagar");
	  g = s.nextDouble();
	  h=(g-f);
	  if(f>g){
		System.out.println( "O valor inserido de "+g+" nao e suficiente, infelizmente nao fazemos fiado (*_*)");		
		System.out.println( "Tenha um bom retorno");		
		}
		else{
		System.out.println( "O valor do seu troco e de: R$"+h);		
		System.out.println( "Tenha um bom retorno");					
		}
   }
}