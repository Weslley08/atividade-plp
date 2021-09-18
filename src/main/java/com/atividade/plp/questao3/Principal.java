package com.atividade.plp.questao3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Calculo calculo = new Calculo();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com a largura: ");
		double larguraResultado = scanner.nextDouble();
		calculo.setLargura(larguraResultado);
		
		System.out.println("Entre com a altura: ");
		double alturaResultado = scanner.nextDouble();
		calculo.setAltura(alturaResultado);

		System.out.println(calculo.area());
		System.out.println(calculo.diagonal());
		System.out.println(calculo.perimetro());	
		
		scanner.close();
	}

}
