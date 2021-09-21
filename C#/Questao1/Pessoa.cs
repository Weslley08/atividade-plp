using System;

class Pessoa 
{
    private String nomePrimeira;
    private int idadePrimeira;
    private String nomeSegunda;
    private int idadeSegunda;

    public Pessoa()
    {
        //Construtor vazio
    }

    public string Nome_Primeira
    {
        set{nomePrimeira = value;}
    }
    
    public int Idade_Primeira
    {
        set{idadePrimeira = value;}
    }


      public string Nome_Segunda
    {
        set{nomeSegunda = value;}
    }

      public int Idade_Segunda
    {
        set{idadeSegunda = value;}
    }


    public String maisVelho(){

        if(idadePrimeira > idadeSegunda){
            return nomePrimeira + " é a pessoa mais velha";
        } else {
            return nomeSegunda + " é a pessoa mais velha";
        }

    }
}