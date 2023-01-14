package exercicosPoo;

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



}


