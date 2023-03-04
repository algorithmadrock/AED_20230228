/*
RESUMO      : Exercício 05, Função recursiva que retorna a o número na posição da sequencia de fibonacci
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */

package controller;

import javax.swing.JOptionPane;

public class EX_05 {

	public void base() {
		int casa;
		do {
			casa = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da sequência de Fibonacci desejada.\n (Limitado a 20)"));
		} while (casa > 20);
		JOptionPane.showMessageDialog(null, "O número que está nessa posição da sequência é "+ recursiva(casa));
	}
	private int recursiva(int c){
		if(c==1 || c==2) {
			return 1;
//			nessas posições o número é 1, como a saída é apenas do número na posição, não importa muito a série começar da posição 1 ou 2
		} else {
			return recursiva(c-2) + recursiva(c-1);
//			a sequencia de fibonnaci se dá pela soma das duas casas anteriores à posição atual, necessitando da chamada da função recursiva duas vezes para o calculo e determinação do valor da casa atual. se CASA fosse 3, seu retorno seria  recursiva(1) + recursiva(2), ou seja, 2.
		}
	}
}
