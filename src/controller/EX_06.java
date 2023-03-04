/*
RESUMO      : Exercício 05, Função recursiva da soma de uma série de limite N!
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */
package controller;

import javax.swing.JOptionPane;

public class EX_06 {

	public void base() {
		int numero;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite do (divisor)! para a somatória"));
		} while (numero > 10);
		JOptionPane.showMessageDialog(null,
				"A soma da série 1/1! + ... + 1/" + numero + "! resulta em " + recursiva(numero));
	}

	private float recursiva(float n) {
		if (n == 1) {
			return 1;
//			faz referência ao começo da série, 1/1! sempre será 1, e a série sempre comecará dessa posição, ignorando a existencia do 0!
		} else {
			return 1 / fatorial(n) + recursiva(n - 1);
//			o resultado do fatorial da "rodada" sempre vai se acumulando com os resultados retornagerados anteriormente, sendo 1/n! + 1/(n-1)!+ 1/(n-2)! + ... + 1/1!
		}
	}

//	função do exercício 1 da aula anterior copiado!!!

	private float fatorial(float fatorial) {
		if (fatorial == 0) {
			return 1;
		}

		else {
			return fatorial * recursiva(fatorial - 1);
		}
	}

}
