package Poo;

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
		
	

	
	
	
	

