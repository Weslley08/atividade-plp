using System;

namespace Questao2
{
    class Program
    {
        static void Main(string[] args)
        {
            Colaborador colaborador = new Colaborador();
            ControllerColaborador controllerFuncionario = new ControllerColaborador();

            for (int i = 1; i <= 2; i++)
            {
                Console.WriteLine("Informe o nome do funcionário de Nº" + i);
                String nomeFuncionario = Console.ReadLine();
                colaborador.NOME = nomeFuncionario;

                Console.WriteLine("Informe o salário do funcionário Nº" + i);
                String salarioFuncionario = Console.ReadLine();
                colaborador.SALARIO = double.Parse(salarioFuncionario);

                controllerFuncionario.adicionar(colaborador);
                colaborador = new Colaborador();

                if (i == 2)
                {
                    Console.WriteLine("\n");
                    Console.WriteLine("Funcionários adicionados!");
                }
            }

            //RESOLUÇÃO QUESTÃO
            Console.WriteLine("\n");
            Console.WriteLine("---------------------------------");
            Console.WriteLine("A média dos salários é R$ " + ControllerColaborador.mediaSalario());
            Console.WriteLine("---------------------------------");
        }
    }
}
