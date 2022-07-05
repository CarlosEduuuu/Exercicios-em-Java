package util;

public class main {

	public static void main(String[] args) {

		// Calculadora

		System.out.println("Exerc Calculadora");

		// Chamada dos métodos exer calculadora simples
		// Classe.método(parâmetos)
		calculadora2.soma(10, 10);
		calculadora2.subtracao(20, 10);
		calculadora2.multiplicacao(500, 10);
		calculadora2.divisao(500, 100);
		calculadora2.restDivisao(7, 2);

		System.out.println("---------------------");
		System.out.println("Exer Hora do dia");
		// Chamada dos métodos exer Hora do dia solução 1com if!
		// Class.métodos(parâmetros)
		HoraDoDia.obterMensagem(11);
		HoraDoDia.obterMensagem(13);
		HoraDoDia.obterMensagem(24);
		HoraDoDia.obterMensagem(25);

		System.out.println("---------------------");
		System.out.println("Hora do dia 2");
		// Chamada dos métodos exer Hora do dia solução 2 com switch, com método dentro
		// de outro!
		// Class.métodos(parâmetros)
		HoraDoDia2.obterHora(5);
		HoraDoDia2.obterHora(13);
		HoraDoDia2.obterHora(19);
		HoraDoDia2.obterHora(29);
		
		System.out.println("---------------------");
		System.out.println("Exer Empréstimo");
		// Chamada do métodos exer emprestimo
		// Chamada do classe.método(parâmetros)

		Emprestimo.verificaparcelas(1, 1000.00);
		Emprestimo.verificaparcelas(2, 1000.00);
		Emprestimo.verificaparcelas(3, 1000.00);
		Emprestimo.verificaparcelas(4, 1000.00);

	}

}
