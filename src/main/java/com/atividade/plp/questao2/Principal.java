package com.atividade.plp.questao2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Colaborador colaboradores = new Colaborador();

        ControllerColaboradores controllerFuncionario = new ControllerColaboradores();

        Scanner leitor = new Scanner(System.in);


        for (int i = 1; i <= 2; i++ ) {

            System.out.printf("Informe o nome do funcionário de Nº %d \n", i);
            String nomeFuncionario = leitor.nextLine();
            colaboradores.setNome(nomeFuncionario);

            System.out.printf("Informe o salário do funcionário Nº %d \n", i);
            double salarioFuncionario = leitor.nextDouble();
            colaboradores.setSalario(salarioFuncionario);

            controllerFuncionario.adicionar(colaboradores);
            colaboradores = new Colaborador();
            leitor = new Scanner(System.in);

            if (i == 2){
                System.out.println("\n");
                System.out.println("Funcionários adicionados!");
            }
        }
        System.out.println("\n");
        System.out.println("---------------------------------");
        System.out.println(String.format("A média dos salários é R$ %.2f ", ControllerColaboradores.mediaSalario()));
        System.out.println("---------------------------------");

        leitor.close();
    }
}
