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
            aluno.NOME = nome;

            Console.WriteLine("Qual a primeira nota do aluno?");
            Double nota1 = Console.Read();
            aluno.NOTA1 = nota1;

            Console.ReadLine();

            Console.WriteLine("Qual a segunda nota do aluno?");
            Double nota2 = Console.Read();
            aluno.NOTA2 = nota2;

            Console.ReadLine();

            Console.WriteLine("Qual a terceira nota do aluno?");
            Double nota3 = Console.Read();
            aluno.NOTA3 = nota3;

            Console.WriteLine("Nome : " + aluno.NOME);
            Console.WriteLine("Nota 1 = " + aluno.NOTA1);
            Console.WriteLine("Nota 2 = " + aluno.NOTA2);
            Console.WriteLine("Nota 3 = " + aluno.NOTA3);
            Console.WriteLine("Nota Final = " + aluno.NOTA_FINAL);

            /*Console.WriteLine(aluno.somarNota());
            Console.WriteLine(aluno.aprovadoOuReprovado());
            Console.WriteLine(aluno.quantoFalta());*/
        }
    }
}
