package com.questao04;

public class Funcionario {

    String nome;
    double salarioBruto;
    double imposto;


    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    double SalarioLiquido() {
        double salarioLiquido = this.salarioBruto - this.imposto;
        return salarioLiquido;
    }

    double AumentarSalario(double porcentagem) {
        double salarioLiquido = this.salarioBruto - this.imposto;
        double novoSalario = (salarioBruto * porcentagem) / 100 + salarioLiquido;
        //this.salarioBruto = novoSalario;
        //return salarioBruto;
        return novoSalario;
    }


}
