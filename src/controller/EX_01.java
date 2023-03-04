/*
RESUMO      : Exercício 01, Função recursiva da somatória dos primeiros N naturais
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */

package controller;

import javax.swing.JOptionPane;

public class EX_01 {

	public EX_01() { // módulo construtor
		super();
	}

	public void base() {
		int numeros;
		do {
			numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de primeiros números naturais."));
		} while (numeros < 0);
		JOptionPane.showMessageDialog(null, "A soma dos " + numeros + " primeiros numeros naturais é: " + recursiva(numeros));
	}

	private int recursiva(int n) {
		if (n == 0) {
			return 0;
//			o 1 é o último número natural capaz de adicionar algo na soma, mas o 0 é considerado um número natural por alguns
		} else {
			return n + recursiva(n-1);
//			a função soma primeiro o maior número (determinado pelo usuário) e vai diminuindo gratativamente na série (n + (n-1) + (n+2) + ... + 0), contemplando todos os números da sequência numérica
		}

	}

}
