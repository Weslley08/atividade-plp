package com.atividade.plp.questao1;

import com.atividade.plp.menu.Menuselecao;

import java.util.Scanner;

public class Principal {


    public void questao01() {

        Menuselecao menuselecao = new Menuselecao();

        System.out.println("QUESTÃO 01 - " +
                "Fazer um programa para ler os dados de duas pessoas, depois mostrar o nome da pessoa mais velha. \n");
        dadosPessoais classe = new dadosPessoais();
        Scanner qLer = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa");
        String nome1 = qLer.nextLine();
        classe.setNomePrimeira(nome1);

        System.out.println("Informe a idade da primeira pessoa");
        int numero1 = qLer.nextInt();
        classe.setIdadePrimeira(numero1);

        qLer = new Scanner(System.in); // bug fix buffer

        System.out.println("Informe o nome da segunda pessoa");
        String nome2 = qLer.nextLine();
        classe.setNomeSegunda(nome2);

        System.out.println("Informe a idade da segunda pessoa");
        int numero2 = qLer.nextInt();
        classe.setIdadeSegunda(numero2);


        // RESOLUÇÃO DA QUESTÃO
        System.out.println(classe.maisVelho());


        // RETORNAR PARA O MENU
        System.out.println("\n");

        System.out.println("Deseja Continuar? " +
                "\n 1 - SIM" +
                "\n 2 - NÃO");


        int menuopcao = qLer.nextInt();
        menuselecao.selecao(menuopcao);





    }

}


