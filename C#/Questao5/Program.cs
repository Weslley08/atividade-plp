using System;

namespace Questao5
{
    class Program
    {
        static void Main(string[] args)
        {
            Aluno aluno = new Aluno();

            Console.WriteLine("Qual o nome do aluno?");
            String nome = Console.Read();
            aluno.name = nome;

            Console.WriteLine("Qual a primeira nota do aluno?");
            double nota1 = Console.Read();
            aluno.n1 = nota1;

            Console.WriteLine("Qual a segunda nota do aluno?");
            double nota2 = Console.Read();
            aluno.n2 = nota2;

            Console.WriteLine("Qual a terceira nota do aluno?");
            double nota3 = Console.Read();
            aluno.n3 = nota3;

            Console.WriteLine(aluno.somarNota());
            Console.WriteLine(aluno.aprovadoOuReprovado());
            Console.WriteLine(aluno.quantoFalta());
        }
    }
}
