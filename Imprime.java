public class Imprime{
	public static void main (String [] args){
		int soma = 0;
		for(int i=1; i<=1000; i++){
			System.out.print(soma  + " + " +  i +  " = ");
			soma = soma+i;
			System.out.println(soma);
		}
		
	}
}