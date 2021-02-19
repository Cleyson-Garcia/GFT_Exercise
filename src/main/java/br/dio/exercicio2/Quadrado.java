package br.dio.exercicio2;

public class Quadrado implements AreaCalculavel{
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
