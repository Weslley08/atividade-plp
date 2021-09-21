package com.atividade.plp.questao4;

import com.atividade.plp.menu.Menuselecao;

import java.util.Scanner;

public class Principal4 {

    public void questao04() {

        Menuselecao menuselecao = new Menuselecao();

        System.out.println("QUESTAO 04 "
                + "Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, "
                + "mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada "
                + "(somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. ");

        Funcionario funcionario = new Funcionario();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nomeFuncionario = leitor.nextLine();
        funcionario.setNome(nomeFuncionario);

        System.out.println("Informe o salário bruto: ");
        double salarioBruto = leitor.nextDouble();
        funcionario.setSalarioBruto(salarioBruto);

        System.out.println("informe o valor em R$ do imposto: ");
        double valorImposto = leitor.nextDouble();
        funcionario.setImposto(valorImposto);

        System.out.println("Digite a porcentagem para aumentar o salário: ");
        double porcetagem = leitor.nextDouble();
        funcionario.aumentarSalario(porcetagem);
        System.out.println("\n");
        System.out.println("\n");

        // RESOLUÇÃO QUESTÃO
        System.out.println("------------------------------ ");
        System.out.println("Dados do Funcionário: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário bruto: R$ " + funcionario.getSalarioBruto());
        System.out.println("Imposto R$ " + funcionario.getImposto());
        System.out.println("Salário Líquido: R$ " + funcionario.SalarioLiquido());
        System.out.println("------------------------------ ");
        System.out.println("\n");

        System.out.println("DADOS ATUALIZADOS");
        System.out.println("Nome: " + funcionario.getNome() + ", R$ " + funcionario.aumentarSalario(porcetagem));

        // RETORNAR PARA O MENU
        System.out.println("\n");

        System.out.println("Deseja Continuar? " + "\n 1 - SIM" + "\n 2 - NÃO");

        int menuopcao = leitor.nextInt();
        menuselecao.selecao(menuopcao);
    }
}
