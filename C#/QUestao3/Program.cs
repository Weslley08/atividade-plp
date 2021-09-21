using System;

namespace Questao3
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculo calculo = new Calculo();

            Console.WriteLine("Entre com altura: ");
            double altura_resultado = Console.Read();
            calculo.ALTURA = altura_resultado; 

            Console.ReadLine();

            Console.WriteLine("Entre com largura: ");
            double largura_resultado = Console.Read();
            calculo.LARGURA = largura_resultado;

            Console.WriteLine(calculo.area());
            Console.WriteLine(calculo.perimetro());
            Console.WriteLine(calculo.diagonal());

        }
    }
}
