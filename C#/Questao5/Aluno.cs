using System;

namespace Questao5
{
    class Aluno
    {
        
        private String name;
        private double n1;
        private double n2;
        private double n3;
        private double notaFinal;

        public Aluno()
        {
            //Construtor vazio
        }

        public NAME 
        {
            set{nome = value;}
        }

        public N1
        {
            set{n1 = value}
        }

        public N2
        {
            set{n2 = value}
        }

        public N3
        {
            set{n3 = value}
        }


        public String somarNota() 
        {
            notaFinal = (n1 + n2 + n3);
            return "NOTA FINAL = " + notaFinal;
        }

        public String aprovadoOuReprovado() 
        {
            if (notaFinal >= 60) 
            {
                return "APROVADO";
            } else {
                return "REPROVADO";
            }
        }

        public String quantoFalta() 
        {
            if (notaFinal < 60) 
            {
                return "FALTARAM " + (60 - notaFinal);
            } else {
                return "";
            }
        }
    }
}
