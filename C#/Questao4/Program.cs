using System;

namespace Questao4
{
    class Program
    {
        static void Main(string[] args)
        {

            Funcionario funcionario = new Funcionario();

            Console.WriteLine("Informe o nome do funcionário: ");
            String nomeFuncionario = Console.ReadLine();
            funcionario.NOME = nomeFuncionario;

            Console.WriteLine("Informe o salário bruto: ");
            String salarioBruto = Console.ReadLine();
            funcionario.SALARIO_BRUTO = double.Parse(salarioBruto);

            Console.WriteLine("informe o valor em R$ do imposto: ");
            String valorImposto = Console.ReadLine();
            funcionario.IMPOSTO = Double.Parse(valorImposto);

            Console.WriteLine("Digite a porcentagem para aumentar o salário: ");
            Double porcentagem = Console.Read();
            funcionario.aumentarSalario(porcentagem);

            // RESOLUÇÃO QUESTÃO
            Console.WriteLine("------------------------------ ");
            Console.WriteLine("Dados do Funcionário: ");
            Console.WriteLine("Nome: " + funcionario.NOME);
            Console.WriteLine("Salário bruto: R$ " + funcionario.SALARIO_BRUTO);
            Console.WriteLine("Imposto R$ " + funcionario.IMPOSTO);
            Console.WriteLine("Salário Líquido: R$ " + funcionario.SalarioLiquido());
            Console.WriteLine("------------------------------ ");

            Console.WriteLine("DADOS ATUALIZADOS");
            Console.WriteLine("Nome: " + funcionario.NOME + ", R$ " + funcionario.aumentarSalario(porcentagem));
        }
    }
}
