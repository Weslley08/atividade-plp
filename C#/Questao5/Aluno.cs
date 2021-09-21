using System;

namespace Questao5
{
    class Aluno
    {

        private string nome;
        private Double nota1;
        private Double nota2;
        private Double nota3;
        private Double notaFinal;

        public Aluno()
        {
            //Construtor vazio
        }

        public string NOME 
        {
            get{return nome;}
            set{nome = value;}
        }

        public Double NOTA1
        {
            get{return nota1;}
            set{nota1 = value;}
        }

        public Double NOTA2
        {
            get{return nota2;}
            set{nota2 = value;}
        }

        public Double NOTA3
        {
            get{return nota3;}
            set{nota3 = value;}
        }

        public Double NOTA_FINAL
        {
            get{return notaFinal;}
            set{notaFinal = value;}
        }

        public String somarNota() 
        {
            notaFinal = (nota1 + nota2 + nota3);
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
