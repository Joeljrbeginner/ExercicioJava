package exercicosPoo;

public class Vendedo extends Funcionario {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	public Vendedo(String nome, String endereco, String telefone, String cpf, int codigoSetor, float salarioBase,
			float imposto) {
		super(nome, endereco, telefone, cpf);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
		
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
		
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+
				"\nTelefone: "+getTelefone()+"\nEndereço:"+getEndereco()+"\nCódigo do setor: "+codigoSetor+
				"\nSalário base: "+salarioBase+"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+imposto);
		
	}
	
	public void calcularSalario() {
		double salario_total = salarioBase - (salarioBase *(imposto/100));
		System.out.println("\nO salário líquido a ser recebido pelo empregado "+getNome()+" é igual a: "+salario_total);
	}
	
	


	

}
