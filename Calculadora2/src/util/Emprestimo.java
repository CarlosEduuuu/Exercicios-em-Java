package util;
//Checa quantidade de parcelas
public class Emprestimo {
	public static void verificaparcelas(int parcelas, double valor) {
		if (parcelas == 1) {
			valorVista(valor);//Chama método para cálculo a vista
		} else if (parcelas == 2) {
			valorEmDuas(parcelas, valor);//Chama método para cálculo em duas
		} else if (parcelas == 3) {
			valorEmTres(parcelas, valor);//Chama método para cálculo em duas
		} else {
			System.out.println("Não aceita mais de três parcelas");
		}

	}

	public static void valorVista(double valor) {
		System.out.println("O valor do Empréstimo é: " + valor + " Á vista");//Exibe valor a vista
	}

	public static void valorEmDuas(int parcelas, double valor) {
		double valorTotal = calcValorEmDuas(parcelas, valor);//Chama método para calcular juros em duas
		System.out.println("O Valor do Empréstimo é: " + valorTotal + " Dividido em 2 parcelas de " + valorTotal / parcelas);//Exibe valor em duas
	}
	public static void valorEmTres(int parcelas, double valor) {
		double valorTotal = calcValorEmTres(parcelas, valor);//Chama método para calcular juros em três
		System.out.println("O Valor do Empréstimo é: " + valorTotal + " Dividido em 3 parcelas de " + valorTotal / parcelas);//Exibe valor em duas
	}
//Calcula em juros em duas vezes
	public static double calcValorEmDuas(int parcelas, double valor) {
		double juros = 5.50;
		return (parcelas * juros) + valor;

	}
	//Calcula em juros em Três vezes
	public static double calcValorEmTres(int parcelas, double valor) {
		double juros = 8.00;
		return (parcelas * juros) + valor;

	}

}
