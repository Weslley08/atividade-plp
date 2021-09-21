package com.atividade.plp.questao5;

public class Aluno {

    private String name;
    private int n1;
    private int n2;
    private int n3;
    private int notaFinal;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNota1() {
        return n1;
    }

    public void setNota1(int n1) {
        this.n1 = n1;
    }

    public int getNota2() {
        return n2;
    }

    public void setNota2(int n2) {
        this.n2 = n2;
    }

    public int getNota3() {
        return n3;
    }

    public void setNota3(int n3) {
        this.n3 = n3;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
}

