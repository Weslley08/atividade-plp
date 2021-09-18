package com.atividade.plp.questao3;

public class Calculo {

	private double largura;
	private double altura;

	double area() {
		return largura * altura;
	}

	double perimetro() {
		return (altura * 2) + (largura * 2);
	}

	double diagonal() {
		double diagonal = (largura * largura) + (altura * altura);
		return Math.sqrt(diagonal);
	}

	public Calculo() {
		super();
	}

	// Setter Largura
	public void setLargura(double largura) {
		this.largura = largura;
	}

	// Setter Altura
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
