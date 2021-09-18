package com.atividade.plp.questao5;

public class Aluno {

    private String name;
    private double n1;
    private double n2;
    private double n3;
    private double notaFinal;

    public String somarNota() {
        notaFinal = (n1 + n2 + n3);
        return "NOTA FINAL = " + notaFinal;
    }

    public String aprovadoOuReprovado() {
        if (notaFinal >= 60) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    public String quantoFalta() {
        if (notaFinal < 60) {
            return "FALTARAM " + (60 - notaFinal);
        } else {
            return "";
        }
    }

    public Aluno() {
        super();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNota1(double n1) {
        this.n1 = n1;
    }

    public void setNota2(double n2) {
        this.n1 = n2;
    }

    public void setNota3(double n3) {
        this.n1 = n3;
    }

}
