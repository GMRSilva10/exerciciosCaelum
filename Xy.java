import java.util.Scanner;
public class Xy{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while( i < 100 ){
		System.out.println("Digite um n�mero inteiro maior ou igual a 100");
		i = sc.nextInt();
			If (i >=100){
				System.out.println(i);
			}else{
				System.out.println("Erro! O n�mero digitado � menor que 100");
			}
			
		}
	}
}