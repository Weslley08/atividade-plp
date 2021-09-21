package com.atividade.plp.questao3;

import com.atividade.plp.menu.Menuselecao;

import java.util.Scanner;

public class Principal3 {

    public void questao3() {

        Menuselecao menuselecao = new Menuselecao();

        System.out.println("QUESTÃO 03 " +
                "Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal."
        );

        Calculo calculo = new Calculo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a largura: ");
        double larguraResultado = scanner.nextDouble();
        calculo.setLargura(larguraResultado);

        System.out.println("Entre com a altura: ");
        double alturaResultado = scanner.nextDouble();
        calculo.setAltura(alturaResultado);

        //RESOLUÇÃO QUESTÃO
        System.out.println(calculo.area());
        System.out.println(calculo.diagonal());
        System.out.println(calculo.perimetro());

        // RETORNAR PARA O MENU
        System.out.println("\n");

        System.out.println("Deseja Continuar? " +
                "\n 1 - SIM" +
                "\n 2 - NÃO");


        int menuopcao = scanner.nextInt();
        menuselecao.selecao(menuopcao);
    }

}
