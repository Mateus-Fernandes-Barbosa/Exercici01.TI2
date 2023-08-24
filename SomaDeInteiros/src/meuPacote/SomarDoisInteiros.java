package meuPacote;
import java.util.*;
public class SomarDoisInteiros {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
			
				
				//Declarando variáveis
				int num1, num2, resultado;
				
				//Recebendo valores
				System.out.println("Escreva um número: ");
				num1 = leia.nextInt();
				System.out.println("Escreva outro número: ");
				num2 = leia.nextInt();
				
				//Realizando operação
				resultado = num1 + num2;
				
				//Declarando resultado
				System.out.println("Resultado: "+resultado);


	}

}
