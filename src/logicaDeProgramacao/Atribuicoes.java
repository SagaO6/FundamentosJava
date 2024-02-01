package logicaDeProgramacao;


public class Atribuicoes {

	public static void main(String[] args) {
		int numero = 10;

		System.err.println("Número = " + 10);
		System.out.println("Soma += | Soma = " + (numero += 5));
		System.out.println("Substração -= | Subtração = " + (numero -= 5));
		System.out.println("Multiplicação *= | Multiplicação = " + (numero *= 5));
		System.out.println("Divisão /= | Divisão = " + (numero /= 5));
		System.out.println("______________________________________");
		System.out.println("Incrementações");
		numero++;
		System.out.println("Número = " + numero );
		numero--;
		System.out.println("Número = " + numero );

	}

}
