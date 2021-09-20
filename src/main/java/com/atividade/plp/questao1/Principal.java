package com.atividade.plp.questao1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        DadosPessoais classe = new DadosPessoais();
        Scanner qLer = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa");
        String nome1 = qLer.nextLine();
        classe.setNomePrimeira(nome1);

        System.out.println("Informe a idade da primeira pessoa");
        int numero1 = qLer.nextInt();
        classe.setIdadePrimeira(numero1);

        System.out.println("Informe o nome da segunda pessoa");
        String nome2 = qLer.nextLine();
        classe.setNomeSegunda(nome2);

        System.out.println("Informe a idade da segunda pessoa");
        int numero2 = qLer.nextInt();
        classe.setIdadeSegunda(numero2);

        System.out.println(classe.maisVelho());

        qLer.close();
    }

}


