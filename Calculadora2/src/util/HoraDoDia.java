package util;

//Solução 1 do problema obter hora do dia
public class HoraDoDia {
	public static void obterMensagem(int hora) {
		if (hora >= 5 && hora <= 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}

		else if (hora > 24) {
			System.out.println("Hora inválida!");
		} else {
			System.out.println("Boa noite!");
		}

	}
}



