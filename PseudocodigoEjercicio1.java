import java.util.Scanner;

public class PseudocodigoEjercicio1{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		int pares = 0;
		int impares = 0;
		int auxiliar;
		
		System.out.print("Ingrese un numero entero: ");
		numero = entrada.nextInt();
		
		for(int i = 0; i<numero; i++){
			auxiliar = (int)(Math.random() * (100 - 1 + 1) + 1);
			if(auxiliar%2==0){
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Hay " + pares + " numeros pares.");
		System.out.println("Hay " + impares + " numeros impares.");
		
	}
	
	
}
