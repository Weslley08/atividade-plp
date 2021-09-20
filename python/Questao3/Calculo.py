import math

class Calculo():
    largura = 0
    altura = 0

def area(altura, largura):
    return "AREA = " + altura * largura

def perimetro(altura, largura):
    return "PERIMETRO = " + (altura * 2) + (largura * 2)

def diagonal(altura, largura):
    diagonal = (largura * largura) + (altura * altura)
    math.sqrt(diagonal)
    return "DIAGONAL = " + diagonal



