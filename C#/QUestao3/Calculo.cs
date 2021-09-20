using System;

class Calculo 
{
    public double altura;
    public double largura;

    public Calculo()
    {
        //Construtor vazio
    }

    public string ALTURA
    {
        set{altura = value;}
    }
    
    public int LARGURA
    {
        set{largura = value;}
    }


    public string area()
    {
        return "AREA = " + largura * altura;
    }

    public string perimetro()
    {
        return "PERIMETRO = " + (altura * 2) + (largura * 2);
    }

    public string diagonal() 
    {
        double diagonal = (largura * largura) + (altura * altura);
		return "DIAGONAL = " + Math.Sqrt(diagonal);
    }

}