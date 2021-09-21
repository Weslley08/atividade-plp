using System;

namespace Questao5
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Clear();
            Aluno aluno = new Aluno();

            Console.WriteLine("Qual o nome do aluno?");
            String nome = Console.ReadLine();
            aluno.NOME = nome;

            Console.WriteLine("Qual a primeira nota do aluno?");
            string nota1 = Console.ReadLine();
            aluno.NOTA1 = double.Parse(nota1);

            Console.WriteLine("Qual a segunda nota do aluno?");
            string nota2 = Console.ReadLine();
            aluno.NOTA2 = double.Parse(nota2);

            Console.WriteLine("Qual a terceira nota do aluno?");
            string nota3 = Console.ReadLine();
            aluno.NOTA3 = double.Parse(nota3);


            Console.WriteLine("Nome : " + aluno.NOME);
            Console.WriteLine(aluno.somarNota());
            Console.WriteLine(aluno.aprovadoOuReprovado());
            Console.WriteLine(aluno.quantoFalta());
        }
    }
}
