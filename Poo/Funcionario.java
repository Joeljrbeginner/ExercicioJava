package Poo;

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

