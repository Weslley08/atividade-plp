using System;

class Calculo 
{
    private double altura;
    private double largura;

    public Calculo()
    {
        //Construtor vazio
    }

    public double ALTURA
    {
        set{altura = value;}
    }
    
    public double LARGURA
    {
        set{largura = value;}
    }


    public string area()
    {
        return "AREA = " + largura * altura;
    }

    public string perimetro()
    {
        return "PERIMETRO = " + ((altura * 2) + (largura * 2));
    }

    public string diagonal() 
    {
        double diagonal = ((largura * largura) + (altura * altura));
        Math.Sqrt(diagonal);
		return "DIAGONAL = " + diagonal;
    }

}