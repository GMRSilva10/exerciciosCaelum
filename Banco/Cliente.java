public class Cliente{
	String nome;
	String endereco;
	String cpf;

	void setNome(String nome){
		this.nome = nome;
	}
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public String getNome(){
		return this.nome;
	}
}