package util;
//M�todos para realizar as opera��es da calculadora.

public class calculadora2 {
//Soma
	public static void soma(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Resultado da Soma de " + num1 + " + " + num2 + " �: " + result);
	}

//	Subtr��o
	public static void subtracao(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("Resultado da Subtr��o de " + num1 + " - " + num2 + " �: " + result);
	}

//Multiplica��o
	public static void multiplicacao(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("Resultado da Multiplica��o de " + num1 + " * " + num2 + " �: " + result);
	}

//Divis�o
	public static void divisao(double num1, double num2) {
		double result = num1 / num2;
		System.out.println("Resultado da Divis�o de " + num1 + " / " + num2 + " �: " + result);
	}

//Resto da Divis�o
	public static void restDivisao(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("O resto da divis�o dos numeros " + num1 + " % " + num2 + " �: " + result);
	}

}