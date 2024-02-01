package pooTurma;

public class Funcionarios {

	public static void main(String[] args) {
		Administrativo Funcionario1 = new Administrativo();
		Funcionario1.nome = "Carlos";
		Funcionario1.telefone = "11993647928";
		Funcionario1.emailCorporativo = "Carlos123@gmail.com";
		Funcionario1.redeDominio = "@sp.senac.br";
		Funcionario1.acessarSistema();
		
		Administrativo Funcionario2 = new Administrativo();
		Funcionario2.nome = "Joelma";
		Funcionario2.telefone = "11913647928";
		Funcionario2.emailCorporativo = "Joelma123@gmail.com";
		Funcionario2.redeDominio = "@sesi.com.br";
		Funcionario2.acessarSistema();

	}

}
