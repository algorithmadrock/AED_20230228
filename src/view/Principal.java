/*
RESUMO      : "Menu" dos exercicios para facilitar a execução
PROGRAMADORA: Luiza Felix
DATA        : 04/03/2023
 */

package view;

import controller.*;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		EX_01 umme = new EX_01();
		EX_02 dois = new EX_02();
		EX_03 tres = new EX_03();
		EX_04 qtro = new EX_04();
		EX_05 cnco = new EX_05();
		EX_06 seis = new EX_06();

		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite o exercício para exibição:\n\n 1)  Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros número NATURAIS (a função deve retornar zero para números negativos)\n 2) Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro, converta para binário. Entrada limitada a 2000.\n 3) Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número inteiro (N), apresente a saída da somatória: S= 1 + 1/2 + 1/3 + ... + 1/N \n 4) Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um numero inteiro de 10 a 999999 e recebendo um 2º número inteiro (de 0 a 9),\n    tenha uma função recursiva que apresente quantas vezes o 2º número aparece no primeiro.\n 5) Escrever uma função recursiva que, dado uma posição da série fibonacci, a função retorne seu valor. Entrada limitada a 20.\n 6) Considerando exercícios realizados anteriormente, criar uma função recursiva que solucione a função (Entrada limitada a 10):  S= 1 + 1/2! + 1/3! + ... + 1/N! \n\n Para SAIR digite 0."));
			switch (opcao) {
			case 1:
				umme.base();
				break;
			case 2:
				dois.base();
				break;
			case 3:
				tres.base();
				break;
			case 4:
				qtro.base();
				break;
			case 5:
				cnco.base();
				break;
			case 6:
				seis.base();
				break;
			case 0:
				System.out.println("Programa finalizado com sucesso! ");
				break;
			default:
				System.out.println("!!! ERRO: DIGITE UMA OPÇÃO VÁLIDA!!!");
			}
		} while (opcao != 0);
	}

}