package com.atividade.plp.questao1;

public class dadosPessoais {

    private String nomePrimeira;
    private int idadePrimeira;
    private String nomeSegunda;
    private int idadeSegunda;

    public dadosPessoais(){
        //Construtor vazio
    }

    public void setNomePrimeira(String nomePrimeira) {
        this.nomePrimeira = nomePrimeira;
    }

    public void setIdadePrimeira(int idadePrimeira) {
        this.idadePrimeira = idadePrimeira;
    }

    
    public void setNomeSegunda(String nomeSegunda) {
        this.nomeSegunda = nomeSegunda;
    }

    public void setIdadeSegunda(int idadeSegunda) {
        this.idadeSegunda = idadeSegunda;
    }

    public String maisVelho(){

        if(idadePrimeira > idadeSegunda){

            return nomePrimeira + " é a pessoa mais velha";
        } else {
            return nomeSegunda + " é a pessoa mais velha";

        }

    }


}