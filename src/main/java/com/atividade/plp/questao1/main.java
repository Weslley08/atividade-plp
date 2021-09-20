package q1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        dadosPessoais classe = new dadosPessoais();
        Scanner qLer = new Scanner(System.in);

        System.out.println("Informe o nome da primeira pessoa");
        String nome1 = qLer.nextLine();
        classe.setNomePrimeira(nome1);

        System.out.println("Informe a idade da primeira pessoa");
        int numero1 = qLer.nextInt();
        classe.setIdadePrimeira(numero1);

        qLer = new Scanner(System.in);

        System.out.println("Informe o nome da segunda pessoa");
        String nome2 = qLer.nextLine();
        classe.setNomeSegunda(nome2);

        System.out.println("Informe a idade da segunda pessoa");
        int numero2 = qLer.nextInt();
        classe.setIdadeSegunda(numero2);


        System.out.println(classe.maisVelho());

    }

}


