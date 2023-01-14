package Poo;

public class ExerciciosPooClasses {

	public class ClasseFarmacia {
		  
		private String nomefarmacia;
		private String popular;
		private String bairro;
		private String rua;
		private int numero;
		
			
		public ClasseFarmacia(String nomefarmacia, String popular, String bairro, String rua, int numero) {
			super();
			this.nomefarmacia = nomefarmacia;
			this.popular = popular;
			this.bairro = bairro;
			this.rua = rua;
			this.numero = numero;
		}


		public String getNomefarmacia() {
			return nomefarmacia;
		}


		public void setNomefarmacia(String nomefarmacia) {
			this.nomefarmacia = nomefarmacia;
		}


		public String getPopular() {
			return popular;
		}


		public void setPopular(String popular) {
			this.popular = popular;
		}


		public String getBairro() {
			return bairro;
		}


		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		public String getRua() {
			return rua;
		}


		public void setRua(String rua) {
			this.rua = rua;
		}


		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public void imprimirInfo() {
			

		System.out.println("\nNome da farmarcia: "+nomefarmacia+" aqui você encontra produtos populares: "+popular);
		System.out.println("Localizado no bairro: "+bairro+ "na rua : "+rua+ "nº : " +numero );
		
		}
	}
			
	public class TestaFramacia {

		public static void main(String[] args) {
			ClasseFarmacia Farm = new ClasseFarmacia("Drogaria Popular ","Remédios","Santo Antonio","rua Dois",10);
			Farm.imprimirInfo(); 
	}
		public class Funcionario {

			private String NomeFuncionario;
		    private String Setor;
		    private int HorasMensais;
		    private String Salario;
		    
		    

		public Funcionario(String nomeFuncionario, String setor, int horasMensais, String salario) {
				super();
				NomeFuncionario = nomeFuncionario;
				Setor = setor;
				HorasMensais = horasMensais;
				Salario = salario;
				
				
				
			}



		public String getNomeFuncionario() {
			return NomeFuncionario;
		}



		public void setNomeFuncionario(String nomeFuncionario) {
			NomeFuncionario = nomeFuncionario;
		}



		public String getSetor() {
			return Setor;
		}



		public void setSetor(String setor) {
			Setor = setor;
		}



		public int getHorasMensais() {
			return HorasMensais;
		}



		public void setHorasMensais(int horasMensais) {
			HorasMensais = horasMensais;
		}



		public String getSalario() {
			return Salario;
		}



		public void setSalario(String salario) {
			Salario = salario;
		}



		public void imprimirInfo() {

			  System.out.println("\nNome: "+NomeFuncionario+" Profissão: " +Setor+" Horas trabahadas: "+HorasMensais+  " horas Salário: " +Salario+"");
		}

		}
		public class TesteFuncionario {

			public static void main(String[] args) {
				
				
				Funcionario fun = new Funcionario ("Gabriel Santos","Professor ",42,"2500");
				fun.imprimirInfo();
		}
		}
	}
}

