package com.atividade.plp.menu;

import com.atividade.plp.questao1.Principal;
import com.atividade.plp.questao2.Principal2;
import com.atividade.plp.questao3.Principal3;
import com.atividade.plp.questao4.Principal4;
import com.atividade.plp.questao5.Principal5;

import java.util.Scanner;

public class Menuselecao {

    public static void menu() {

        Scanner leitor = new Scanner(System.in);
        Principal principal = new Principal();
        Principal2 principal2 = new Principal2();
        Principal3 principal3 = new Principal3();
        Principal4 principal4 = new Principal4();
        Principal5 principal5 = new Principal5();


        System.out.println("-- MENU -- ");
        System.out.println("1 - QUESTÃO 01");
        System.out.println("2 - QUESTÃO 02");
        System.out.println("3 - QUESTÃO 03");
        System.out.println("4 - QUESTÃO 04");
        System.out.println("5 - QUESTÃO 05");
        System.out.println("6 - SAIR");
        System.out.println("\n");

        System.out.println("Informe a questão: ");
        int questao = leitor.nextInt();

        switch (questao) {

            case 1:
                principal.questao01();
                break;

            case 2:
                principal2.questao02();
                break;

            case 3:
                principal3.questao3();
                break;

            case 4:
                principal4.questao04();
                break;

            case 5:
                principal5.questao05();
                break;

            default:
                System.out.println("Opção inválida! ");
        }


    }

    public void selecao(int n){
        switch (n){
            case 1:
                this.menu();

            default:
                System.out.println("Aplicação finalizada");
                break;

        }
    }


}

