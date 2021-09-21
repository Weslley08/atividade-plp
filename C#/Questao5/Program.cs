using System;

namespace Questao5
{
    class Program
    {
        static void Main(string[] args)
        {
            Aluno aluno = new Aluno();

            Console.WriteLine("Qual o nome do aluno?");
            String nome = Console.ReadLine();
            aluno.NAME = nome;

            Console.WriteLine("Qual a primeira nota do aluno?");
            double nota1 = Console.Read();
            aluno.N1 = nota1;

            Console.ReadLine();

            Console.WriteLine("Qual a segunda nota do aluno?");
            double nota2 = Console.Read();
            aluno.N2 = nota2;

            Console.ReadLine();

            Console.WriteLine("Qual a terceira nota do aluno?");
            double nota3 = Console.Read();
            aluno.N3 = nota3;

            Console.WriteLine(aluno.somarNota());
            Console.WriteLine(aluno.aprovadoOuReprovado());
            Console.WriteLine(aluno.quantoFalta());
        }
    }
}
