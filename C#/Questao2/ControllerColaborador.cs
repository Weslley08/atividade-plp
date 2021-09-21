using System;
using System.Collections.Generic;

namespace Questao2
{
    public class ControllerColaborador
    {

        static List<Colaborador> colaborador = new List<Colaborador>();

        public static List<Colaborador> getColaborador()
        {
            return colaborador;
        }

        public void adicionar(Colaborador f)
        {
            colaborador.Add(f);
        }

        public static double mediaSalario()
        {
            double total = 0;
            foreach (Colaborador f in colaborador)
            {
                total += f.SALARIO;
            }

            return total / 2;

        }
    }
}