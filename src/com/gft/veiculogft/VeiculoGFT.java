package com.gft.veiculogft;

public abstract class VeiculoGFT {
	public String modelo;
	public int velocidade;
	public int passageiros;
	public float combustivel;
	public boolean isLigado;
	public int quantidade;

	public VeiculoGFT(String modelo, int velocidade, int passageiros, float combustivel) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public float getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}

						// Métodos
	public void liga() {
		isLigado = true;
		System.out.println("O veículo está ligado");
	}
	public void freiar(int quantidade) {
		if (isLigado && velocidade != 0) {
			int velocidadeNova = this.velocidade - quantidade;
			this.velocidade = velocidadeNova;

			System.out.println("O carro está " + velocidade + "Km/h");
		} else {
			System.out.println("O carro já está parado");
		}
	}
	public  void abastecer() {
		
	}

	public  void acelera() {
		
	}

	public void desliga() {
		if (velocidade == 0) {
			isLigado = false;
			System.out.println("O veículo está desligado");
		} else {
			System.out.println("O veículo está em movimento");
		}
	}

}
