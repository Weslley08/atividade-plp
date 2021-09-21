package com.atividade.plp.questao2;

import com.atividade.plp.menu.Menuselecao;

import java.util.Scanner;

public class Principal2 {

    public void questao02() {

        Menuselecao menuselecao = new Menuselecao();

        System.out.println("QUESTÃO 02" +
                "Fazer um programa para ler nome e salário de dois funcionários. Depois, mostrar o salário médio dos funcionários.");


        Colaborador colaboradores = new Colaborador();

        ControllerColaboradores controllerFuncionario = new ControllerColaboradores();

        Scanner leitor = new Scanner(System.in);


        for (int i = 1; i <= 2; i++) {

            System.out.printf("Informe o nome do funcionário de Nº %d \n", i);
            String nomeFuncionario = leitor.nextLine();
            colaboradores.setNome(nomeFuncionario);

            System.out.printf("Informe o salário do funcionário Nº %d \n", i);
            double salarioFuncionario = leitor.nextDouble();
            colaboradores.setSalario(salarioFuncionario);

            controllerFuncionario.adicionar(colaboradores);
            colaboradores = new Colaborador();
            leitor = new Scanner(System.in);

            if (i == 2) {
                System.out.println("\n");
                System.out.println("Funcionários adicionados!");
            }
        }

        //RESOLUÇÃO QUESTÃO
        System.out.println("\n");
        System.out.println("---------------------------------");
        System.out.println(String.format("A média dos salários é R$ %.2f ", ControllerColaboradores.mediaSalario()));
        System.out.println("---------------------------------");

        // RETORNAR PARA O MENU
        System.out.println("\n");

        System.out.println("Deseja Continuar? " +
                "\n 1 - SIM" +
                "\n 2 - NÃO");


        int menuopcao = leitor.nextInt();
        menuselecao.selecao(menuopcao);
    }
}
