using System;

namespace Questao4
{
    public class Funcionario
    {
        String nome;
        double salarioBruto;
        double imposto;

        public string NOME
        {
            get { return nome; }
            set { nome = value; }
        }

        public double SALARIO_BRUTO
        {
            get { return salarioBruto; }
            set { salarioBruto = value; }
        }

        public double IMPOSTO
        {
            get { return imposto; }
            set { imposto = value; }
        }

        public double SalarioLiquido()
        {
            double salarioLiquido = this.salarioBruto - this.imposto;
            return salarioLiquido;
        }

        public double aumentarSalario(double PORCENTAGEM)
        {
            double salarioLiquido = this.salarioBruto - this.imposto;
            return (salarioBruto * PORCENTAGEM) / 100 + salarioLiquido;
        }


    }
}