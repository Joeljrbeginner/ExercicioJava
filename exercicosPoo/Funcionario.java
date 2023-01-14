package exercicosPoo;

public class Funcionario {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	

	
	public Funcionario(String nome, String endereco, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		
		
	}

     public String getNome() {
		return nome;
	}

public void setNome(String nome) {
		this.nome = nome;
	}









	public String getEndereco() {
		return endereco;
	}









	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}









	public String getTelefone() {
		return telefone;
	}









	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}









	public String getCpf() {
		return cpf;
	}









	public void setCpf(String cpf) {
		this.cpf = cpf;
		
		
	}
	public void validarCpf() {
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		}
		else
		{
			System.out.println("\n--CPF Válido!!!");
		}
	}








	public void imprimirInfo() {
		
		  System.out.println("\nNome: "+nome+" Endereço: " +endereco+" Telefone: "+telefone+  " CPF: "+cpf);	
}
}