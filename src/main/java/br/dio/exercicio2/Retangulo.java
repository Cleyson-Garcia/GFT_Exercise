package br.dio.exercicio2;

public class Retangulo implements AreaCalculavel{
    double largura,altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.largura * this.altura;
    }
}
