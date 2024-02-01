package logicaDeProgramacao;


public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int numero = 10;
		
		System.out.println("Número = " + numero);
		System.out.println("Soma = " + numero + " + 5 | Número = " + (numero + 5));
		System.out.println("Subtração = " + numero + " - 5 | Número = " + (numero - 5));
		System.out.println("Multiplicação = " + numero + " * 5 | Número = " + (numero * 5));
		System.out.println("Divisão = " + numero + " / 5 | Número = " + (numero / 5));
		System.out.println("Resto = " + numero + " % 5 | Número = " + (numero % 5));
		
		System.out.println("");
		
		double idade = 21; 
		double idade2 = 23;
		double idade3 = 45;
		double idade4 = 12;
		double idade5 = 78;
		double media = 0;
		
		media = (idade + idade2 + idade3 + idade4 + idade5)/5;
		
		System.out.println("A média é " + media);
		
		
	}

}
