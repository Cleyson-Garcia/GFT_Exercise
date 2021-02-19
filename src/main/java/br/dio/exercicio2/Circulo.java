package br.dio.exercicio2;

public class Circulo implements AreaCalculavel{
    double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow((this.diametro/2),2);
    }
}
