package logicaDeProgramacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char sexo = 'M';
		
				if (sexo == 'M' & idade >= 18) {
					System.out.println("Alistamento militar obrigatório!");
					
				}
				
				else  {
					System.out.println("Não é necessário se alistar.");
					 
				}
				
				System.out.println("___________________________________");

				if (sexo == 'M') {
					
					if (idade >= 18) {
						System.out.println("Alistamento militar obrigatório!");
						
					}
					
					else {
						System.out.println("Voce não tem a idade necessaria");
					}
			
				}
				
				else {
					System.out.println("É preciso ser do sexo masculino para com obrigatoriedade");
				}
				
				
				System.out.println("Uso do switch-case");
				System.out.println("Opção 1: Relatorio de clientes");
				System.out.println("Opção 2: Relatorio de funcionarios");
				System.out.println("Opção 3: Relatorio de vendas");
				
				int opcao = 3;
				
				switch(opcao) {
				case 1:
					System.out.println("Relatorio de clientes");
					break;
					
				case 2:
					System.out.println("Relatorio de funcionarios");
					break;
					
				case 3:
					System.out.println("Relatorio de vendas");
					break;
					
				default:
					System.out.println("Opção invalida");
					break;
					
				}
	}

}