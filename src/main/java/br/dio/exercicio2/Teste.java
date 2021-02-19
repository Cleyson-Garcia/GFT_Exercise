package br.dio.exercicio2;

public class Teste {
    public static void main(String[] args) {
        Quadrado quad = new Quadrado(10);
        Retangulo ret = new Retangulo(15,10);
        Circulo circ = new Circulo(10);

        System.out.println("Area do Quadrado = " + quad.calcularArea());
        System.out.println("Area do Retangulo = " + ret.calcularArea());
        System.out.println("Area do Circulo = " + circ.calcularArea());
    }
}
