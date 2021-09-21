package com.atividade.plp.questao3;

public class Calculo {

	private double largura;
	private double altura;

	public String area() {
		return "AREA = " + largura * altura;
	}

	public String perimetro() {
		return "PERIMETRO = " + ((altura * 2) + (largura * 2));
	}

	public String diagonal() {
		double diagonal = (largura * largura) + (altura * altura);
		return "DIAGONAL = " + Math.sqrt(diagonal);
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
