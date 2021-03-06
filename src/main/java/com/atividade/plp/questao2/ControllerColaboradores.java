package com.atividade.plp.questao2;

import java.util.ArrayList;

public class ControllerColaboradores {

    private static ArrayList<Colaborador> colaboradors = new ArrayList<Colaborador>();

    public static ArrayList<Colaborador> getColaboradors() {
        return colaboradors;
    }

    public void adicionar(Colaborador f) {
        colaboradors.add(f);
    }

    static double mediaSalario(){
        double total = 0;
        for (Colaborador f : colaboradors) {
        total += f.getSalario();
        }
        
        return total /2;

    }

}
