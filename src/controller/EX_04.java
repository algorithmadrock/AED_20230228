/*
RESUMO      : Exercício 04, Função recursiva de contagem de número (n) repetido em um segundo valor
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */
package controller;

import javax.swing.JOptionPane;

public class EX_04 {

	public void base() {
		int numero, busca;

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro grande.\n (Valores de 10 à 999999)"));
		} while (numero < 10 || numero > 999999);
		do {
			busca = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para buscar dentro do número grande.\n (Valores de 0 à 9)"));
		} while (busca < 0 || busca > 9);

		JOptionPane.showMessageDialog(null,"O número " + busca + " aparece " + recursiva(numero, busca) + " vezes em " + numero);
	}

	private int recursiva(int n1, int n2) {
		if (n1 < 1) {
			return 0;
//			se o nº1 for menor que 1 não tem como ele ser igual a nº2
		} else {

			if (n1 % 10 == n2) {
				return 1 + recursiva(n1 / 10, n2);
			}
			return 0 + recursiva(n1 / 10, n2);

//			seguindo a dica, dividindo o número por 10 eu consigo comparar o resto e "contabilizar" aquela casa, se o número for uma centena, na próxima rodada ele será uma dezena e depois uma unidade, até que não sobre "digitos" (ele todo virar um número decimal)
		}
	}
}
