package com.atividade.plp.questao5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
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

        System.out.println(aluno.somarNota());
        System.out.println(aluno.aprovadoOuReprovado());
        System.out.println(aluno.quantoFalta());

        scanner.close();
    }
}
