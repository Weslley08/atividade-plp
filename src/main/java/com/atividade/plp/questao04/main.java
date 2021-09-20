package com.questao04;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

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
        funcionario.AumentarSalario(porcetagem);
        System.out.println("\n");
        System.out.println("\n");


        System.out.println("------------------------------ ");
        System.out.println("Dados do Funcionário: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário bruto: R$ " + funcionario.getSalarioBruto());
        System.out.println("Imposto R$ "+ funcionario.getImposto());
        System.out.println("Salário Líquido: R$ " + funcionario.SalarioLiquido());
        System.out.println("------------------------------ ");
        System.out.println("\n");

        System.out.println("DADOS ATUALIZADOS");
        System.out.println("Nome: " + funcionario.getNome() + ", R$ " +  funcionario.AumentarSalario(porcetagem));







    }
}
