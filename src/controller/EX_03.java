/*
RESUMO      : Exercício 03, Função recursiva da soma de uma série de limite N
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */
package controller;

import javax.swing.JOptionPane;

public class EX_03 {

	public void base() {
		int numero;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite do divisor para a somatória"));
		} while (numero > 2000);
		JOptionPane.showMessageDialog(null,"A soma da série 1/1 + ... + 1/" + numero + " resulta em " + recursiva(numero));
	}

	private float recursiva(float n) {
		if (n == 1) {
			return 1;
//			faz referência ao começo da série, 1/1 sempre será 1
		} else {
			return (1 / n) + recursiva(n - 1);
//			o resultado da "rodada" sempre vai se acumulando com os resultados gerados anteriormente, sendo 1/n + 1/(n-1)+ 1/(n-2) + ... + 1/1
		}
	}

}
