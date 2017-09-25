public class Banco{
	public static void main (String []args){
		Cliente cliente1 = new Cliente();
		cliente1.setNome("José");
		cliente1.setEndereco("Jua júlio de grazia, 90");
		cliente1.setCPF("40123384800");
	
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Arnaldo");
		cliente2.setEndereco("Nova Esperança, 107");
		cliente2.setCPF("987898342355");

		Conta conta1 = new Conta();
		conta1.saldo = 1000;
		conta1.limite = 2000;
		conta1.numero = 12345;
		conta1.cliente = cliente1;

		conta1.deposita(200);

		Conta conta2 = new Conta();
		conta2.saldo = 0;
		conta2.cliente = cliente2;
		conta2.limite = 500;
		conta2.numero = 54321;
	
		System.out.println("\nO saldo atual da conta 1 é: " + conta1.saldo + " reais");
		System.out.println("A conta 1 pertence ao cliente " + conta1.cliente.getNome());
		System.out.println("\nO saldo da conta 2 é de " + conta2.saldo + " reais");
		System.out.println("A conta 2 pertence ao cliente " + conta2.cliente.getNome());

		boolean transferencia = conta1.transferePara(conta2, 500);
		if (transferencia == true){
			System.out.println("\nTransferência concluída com sucesso");
		}else{
			System.out.println("\nSaldo insuficiente para realizar a transferência");
		}
			
		
		System.out.println("\nAgora o saldo da conta 1, que pertence ao cliente "+ conta1.cliente.getNome()  + ", é de " + conta1.saldo + " reais");
		System.out.println("Agora o saldo da conta 2, que pertence ao cliente "+ conta2.cliente.getNome()  + ", é de " + conta2.saldo + " reais");

					
	}		
}