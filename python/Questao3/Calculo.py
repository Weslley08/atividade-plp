import math

class CalculoRetangulo():
    __largura = 0
    __altura = 0

def area(altura, largura):
    return "AREA = " + altura * largura

def perimetro(altura, largura):
    return "PERIMETRO = " + (altura * 2) + (largura * 2)

def diagonal(altura, largura):
    diagonal = (largura * largura) + (altura * altura)
    math.sqrt(diagonal)
    return "DIAGONAL = " + diagonal


def __init__(self) -> None:
    # Construtor vazio
    pass

def set_largura(self, largura):
    self.largura = largura

def set_altura(self, altura):
    self.altura = altura


