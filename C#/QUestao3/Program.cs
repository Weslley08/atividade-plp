using System;

namespace Questao3
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculo calculo = new Calculo();

            Console.WriteLine("Entre com altura: ");
            string altura_resultado = Console.ReadLine();
            calculo.ALTURA = double.Parse(altura_resultado); 

            Console.WriteLine("Entre com largura: ");
            string largura_resultado = Console.ReadLine();
            calculo.LARGURA = double.Parse(largura_resultado);

            Console.WriteLine(calculo.area());
            Console.WriteLine(calculo.perimetro());
            Console.WriteLine(calculo.diagonal());

        }
    }
}
