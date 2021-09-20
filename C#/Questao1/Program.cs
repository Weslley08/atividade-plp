using System;

namespace Questao1
{
    class Program
    {
        static void Main(string[] args)
        {
            Pessoa pessoa = new Pessoa();

            Console.WriteLine("Informe o nome da primeira pessoa");
            string nome1 = Console.ReadLine();
            pessoa.Nome_Primeira = nome1;

            Console.WriteLine("Informe a idade da primeira pessoa");
            int idade1 = Console.Read();
            pessoa.Idade_Primeira = idade1;

            Console.ReadLine();

            Console.WriteLine("Informe o nome da segunda pessoa");
            String nome2 = Console.ReadLine();
            pessoa.Nome_Segunda = nome2;

            Console.WriteLine("Informe a idade da segunda pessoa");
            int idade2 = Console.Read();
            pessoa.Idade_Segunda =idade2;

            Console.WriteLine(pessoa.maisVelho());
        }
    }
}
