/*
RESUMO      : Exercício 02, Função recursiva da transformação de numeros decimais para binário
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */
package controller;

import javax.swing.JOptionPane;

public class EX_02 {

	public void base() {
		int decimal;
		do {
			decimal = Integer.parseInt(JOptionPane.showInputDialog("Digite um número MENOR QUE 2000 para a conversão em binário."));
		} while (decimal > 2000);
		JOptionPane.showMessageDialog(null, "O número decimal " + decimal + " em binário fica" + recursiva(decimal));
	}

	private String recursiva(int n) {
		if (n < 2) {
			return "1";
//			só o 1 seria menor que 2 nesse cenário, e seu resto sempre será 1 em uma divisão inteira. além de que todo número binário começa com 1
		} else {
			return recursiva(n / 2) + (n % 2);
//			o número binário transformado em divisões de 2 é lido do ultimo resultado para o primeiro, então, para o valor alinhado com a saída das "rodadas" de função recursiva, coloquei o valor no fim após a chamada;
		}

	}

}
