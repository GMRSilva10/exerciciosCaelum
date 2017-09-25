import java.util.Scanner;

public class Fatoriais{

	public static void main (String args[]){

	Scanner sc = new Scanner(System.in);
	int fat=0;
	
	try{		
		System.out.print("Digite um valor para mostrar os fatoriais:");
		fat = sc.nextInt();
	} catch(java.util.InputMismatchException e){
		System.out.println("Digite um valor inteiro seu viado");

	}
	
	sc.close();

		int fatorial = 1;
		for (int i=1; i<=fat; i++){
			fatorial = fatorial*i;
			System.out.println("O fatorial de " + i + " é " + fatorial);
		}
	}
}