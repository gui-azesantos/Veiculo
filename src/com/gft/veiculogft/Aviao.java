package com.gft.veiculogft;

public class Aviao extends VeiculoGFT {
	private String tipo;
	private String uso;

	public Aviao(String modelo, int velocidade, int passageiros, float combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel = 200);
		this.tipo = tipo;
		this.uso = uso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public void abastecer() {
		if (combustivel >= 100) {
			System.out.println("Tanque cheio");
		} else {
			System.out.println("Você tem " + combustivel + " litros");
			while (combustivel < 100) {

				combustivel++;
				System.out.println("Abastecendo: " + combustivel);

			}
			System.out.println("Você abasteceu!!");
			System.out.println("Você tem " + combustivel + " agora");
		}
	}
	
	public void abastecer(String Stringqtdlitros) {
		System.out.println("Seu tanque é: " + combustivel);
		int qtdlitros = Integer.parseInt(Stringqtdlitros);

		if (combustivel <= 200) {
			if (qtdlitros <= (200 - combustivel)) {
				combustivel = combustivel + qtdlitros;
				System.out.println("Seu tanque é : " + combustivel);
			} else {
				System.out.println("A quatidade de combustivel é maior do que a capacidade do tanque");
				System.out.println("Seu tanque é : " + combustivel);
			}
		} else {
			System.out.println("Tanque cheio!");
		}
	}

	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			combustivel = combustivel - 20;
			System.out.println("O Avião está à " + velocidade + "Km/h");
		} else {
			System.out.println("O Avião está desligado");
		}
	}

	
	public void controle(int comando) {
		while (comando == 6) {
			switch (comando) {
			case 1:
				this.liga();
				break;
			case 2:
				this.acelera(20);
				break;
			case 3:
				this.freiar(20);
				break;
			case 4:
				this.abastecer("20");
				break;
			
			case 5:
				this.desliga();
				break;

			case 6:
				System.out.println("Você saiu!");
				System.exit(0);
				break;
			}
			}
		
	}

	

}
