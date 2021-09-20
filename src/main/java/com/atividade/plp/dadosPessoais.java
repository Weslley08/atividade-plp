package q1;

public class dadosPessoais {
    private String nomePrimeira;
    private int idadePrimeira;
    private String nomeSegunda;
    private int idadeSegunda;

    public dadosPessoais(){
    }

    public String getNomePrimeira() {
        return nomePrimeira;
    }

    public void setNomePrimeira(String nomePrimeira) {
        this.nomePrimeira = nomePrimeira;
    }

    public int getIdadePrimeira() {
        return idadePrimeira;
    }

    public void setIdadePrimeira(int idadePrimeira) {
        this.idadePrimeira = idadePrimeira;
    }

    public String getNomeSegunda() {
        return nomeSegunda;
    }

    public void setNomeSegunda(String nomeSegunda) {
        this.nomeSegunda = nomeSegunda;
    }

    public int getIdadeSegunda() {
        return idadeSegunda;
    }

    public void setIdadeSegunda(int idadeSegunda) {
        this.idadeSegunda = idadeSegunda;
    }

    public  String maisVelho(){

        if(idadePrimeira > idadeSegunda){

            return nomePrimeira + " é a mais velha";
        } else {
            return nomeSegunda + " é a mais velha";

        }

    }


}