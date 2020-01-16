package com.gft.veiculogft;

public class Caminhao extends VeiculoGFT {
	private String marca;
	private int portas;
	private String ano;

		public Caminhao(String modelo, int velocidade, int passageiros, float combustivel, String marca, int portas,
			String ano) {
		super(modelo, velocidade, passageiros, combustivel= 150);
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}

		
	public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public int getPortas() {
			return portas;
		}


		public void setPortas(int portas) {
			this.portas = portas;
		}


		public String getAno() {
			return ano;
		}


		public void setAno(String ano) {
			this.ano = ano;
		}
		
		


	public void acelera(int quantidade) {
		if (isLigado) {
			int velocidadeNova = this.velocidade + quantidade;
			this.velocidade = velocidadeNova;
			combustivel = combustivel - 1;
			System.out.println("O Caminhão está " + velocidade + "Km/h");
		} else {
			System.out.println("O Caminhão está desligado");
		}
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

	public void abastecer(float qtdlitros) {
		System.out.println("Seu tanque é: " + combustivel);
		if (combustivel < 150.0) {
			if (qtdlitros <= (150.0 - combustivel)) {
				combustivel = combustivel + qtdlitros;
				System.out.println("Seu tanque é A: " + combustivel);
			} else {
				System.out.println("A quatidade de combustivel é maior do que a capacidade do tanque");
				System.out.println("Seu tanque é B: " + combustivel);
			}
		}else {
			System.out.println("Tanque cheio!");
		}
	}

	public void desliga() {
		super.desliga();
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
			this.abastecer(20);
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
