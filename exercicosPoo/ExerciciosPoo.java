package exercicosPoo;

public class ExerciciosPoo {

	public static void main(String[] args) {
		
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
			public class Gerente extends Funcionario {
				private String HorasMensais;

				public Gerente(String nome, String endereco, String telefone, String cpf, String horasMensais) {
					super(nome, endereco, telefone, cpf);
					HorasMensais = horasMensais;
					
					
				}

				public String getHorasMensais() {
					return HorasMensais;
				}

				public void setHorasMensais(String horasMensais) {
					HorasMensais = horasMensais;
				
				}
				
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
					
					
					package exercicosPoo;

					public class TesteFuncionario {

						public static void main(String[] args) {
							
							
							
							Vendedo Ven = new Vendedo ("José", "rua dois , nº 5", "1191111222l","12345678909", 110,2500,28);
							Ven.imprimirInfo();
							
							Ven.calcularSalario();
							
							
							
							

						}

					}


					

				}



				



