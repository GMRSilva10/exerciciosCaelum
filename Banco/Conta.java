public class Conta{
	double saldo;
	int numero;
	double limite;
	Cliente cliente;

	boolean saca(double valor){
		if (this.saldo<valor){
			return false;
		}else{
			this.saldo-=valor;
			return true;
		}
	}
	void deposita(double valor){
		this.saldo +=valor;
	} 

	boolean transferePara(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if (retirou ==false){
			return false;
		}else{
			destino.deposita(valor);
			return true;
			}	
	}
}