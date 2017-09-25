public class Fibonacci{
	public static void main (String args[]){
		int anterior=1;
		int fibo = 0;
		for(int i = 0; fibo<=100;i++){
			if(fibo==1){
				System.out.println(fibo);
			}
			System.out.println(fibo);
		 	fibo = fibo+anterior;
			anterior = fibo;
		}
	}
} 