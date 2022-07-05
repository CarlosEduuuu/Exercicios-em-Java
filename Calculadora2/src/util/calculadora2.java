package util;
//Métodos para realizar as operações da calculadora.

public class calculadora2 {
//Soma
	public static void soma(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Resultado da Soma de " + num1 + " + " + num2 + " é: " + result);
	}

//	Subtrção
	public static void subtracao(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Resultado da Subtrção de " + num1 + " - " + num2 + " é: " + result);
	}

//Multiplicação
	public static void multiplicacao(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Resultado da Multiplicação de " + num1 + " * " + num2 + " é: " + result);
	}

//Divisão
	public static void divisao(double num1, double num2) {
		double result = num1 / num2;
		System.out.println("Resultado da Divisão de " + num1 + " / " + num2 + " é: " + result);
	}

//Resto da Divisão
	public static void restDivisao(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("O resto da divisão dos numeros " + num1 + " % " + num2 + " é: " + result);
	}

}