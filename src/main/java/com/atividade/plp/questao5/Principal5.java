package com.atividade.plp.questao5;

import com.atividade.plp.menu.Menuselecao;

import java.util.Scanner;

public class Principal5 {

    public void questao05 () {

        Menuselecao menuselecao = new Menuselecao();

        System.out.println("Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano " +
                "(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. " +
                "Dizer também se o aluno está APROVADO ou REPROVADO e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado " +
                "(que é 60 pontos). Você deve criar uma classe Aluno para resolver este problema.");


        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do aluno?");
        String nome = scanner.nextLine();
        aluno.setName(nome);

        System.out.println("Qual a primeira nota do aluno?");
        double nota1 = scanner.nextDouble();
        aluno.setNota1(nota1);

        System.out.println("Qual a segunda nota do aluno?");
        double nota2 = scanner.nextDouble();
        aluno.setNota2(nota2);

        System.out.println("Qual a terceira nota do aluno?");
        double nota3 = scanner.nextDouble();
        aluno.setNota3(nota3);

        //RESOLUÇÃO QUESTÃO
        System.out.println(aluno.somarNota());
        System.out.println(aluno.aprovadoOuReprovado());
        System.out.println(aluno.quantoFalta());

        // RETORNAR PARA O MENU
        System.out.println("\n");

        System.out.println("Deseja Continuar? " +
                "\n 1 - SIM" +
                "\n 2 - NÃO");


        int menuopcao = scanner.nextInt();
        menuselecao.selecao(menuopcao);
    }
}
