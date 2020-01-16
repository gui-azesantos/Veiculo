package com.gft.main;

import java.util.Scanner;
import com.gft.veiculogft.*;

public class main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		Scanner control = new Scanner(System.in);

		int comandoesc = 0;
		int escolha = 1;
		int comando = 0;

		while (escolha != 0) {
			System.out.println("Escolha o veiculo \n [1-Carro] \n [2- Avião] \n [3- Caminhão] \n [4 - Sair]");
			comandoesc = src.nextInt();

			if (comandoesc == 1) {
				Carro A = new Carro(null, 0, 0, 100, null, 0, null);
				escolha = 0;// Finalizador do while
				int controleswitch = 0;
				System.out.println("Digite o número");
				System.out.println("1 - Liga o Carro");
				System.out.println("2 - Acelera");
				System.out.println("3- Freia");
				System.out.println("4- Abastece");
				System.out.println("5 - Desliga");
				System.out.println("6- Sair");
				while (controleswitch != 6) {
					controleswitch = control.nextInt();
					switch (controleswitch) {

					case 1:
						A.liga();
						break;

					case 2:
						A.acelera(20);
						break;
					case 3:
						A.freiar(20);
						break;
					case 4:
						A.abastecer();
						break;

					case 5:
						A.desliga();
						break;

					case 6:
						System.out.println("Você saiu!");
						System.exit(0);
						break;
					}
				}
				// Escolha do Avião
			} else if (comandoesc == 2) {
				Aviao B = new Aviao(null, 0, 0, 200, null, null);
				escolha = 0;// Finalizador do while
				int controleswitch = 0;
				System.out.println("Digite o número");
				System.out.println("1 - Liga o Carro");
				System.out.println("2 - Acelera");
				System.out.println("3- Freia");
				System.out.println("4- Abastece");
				System.out.println("5 - Desliga");
				System.out.println("6- Sair");

				while (controleswitch != 6) {
					controleswitch = control.nextInt();
					switch (controleswitch) {

					case 1:
						B.liga();
						break;

					case 2:
						B.acelera(50);
						break;
					case 3:
						B.freiar(50);
						break;
					case 4:
						B.abastecer();
						break;

					case 5:
						B.desliga();
						break;

					case 6:
						System.out.println("Você saiu!");
						System.exit(0);
						break;
					}
				}

				// Escolha do Caminhão
			} else if (comandoesc == 3) {
				Caminhao C = new Caminhao(null, 0, 0, 150, null, 0, null);
				escolha = 0;// Finalizador do while
				int controleswitch = 0;
				System.out.println("Digite o número");
				System.out.println("1 - Liga o Carro");
				System.out.println("2 - Acelera");
				System.out.println("3- Freia");
				System.out.println("4- Abastece");
				System.out.println("5 - Desliga");
				System.out.println("6- Sair");
				while (controleswitch != 6) {
					controleswitch = control.nextInt();
					switch (controleswitch) {

					case 1:
						C.liga();
						break;

					case 2:
						C.acelera(20);
						break;
					case 3:
						C.freiar(20);
						break;
					case 4:
						C.abastecer();
						break;

					case 5:
						C.desliga();
						break;

					case 6:
						System.out.println("Você saiu!");
						System.exit(0);
						break;
					}
				}
				// Sair
			} else if (comandoesc == 4) {
				System.exit(0);
				// Comando Inválido
			} else {
				System.out.println("COMANDO INVÁLIDO");
				escolha = 1;
			}
		}

	}
}
