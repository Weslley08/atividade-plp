from Questao3.Calculo import CalculoRetangulo


class Principal():
    largura_resultado = 0
    altura_resultado = 0

    print("Entre com a altura: ")
    altura_resultado = input()
    CalculoRetangulo.set_altura(largura_resultado)

    print("Entre com a largura: ")
    largura_resultado = input()
    CalculoRetangulo.set_largura(altura_resultado)

    print(CalculoRetangulo.area)
    print(CalculoRetangulo.perimetro)
    print(CalculoRetangulo.diagonal)
    