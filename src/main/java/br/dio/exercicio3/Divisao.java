package br.dio.exercicio3;

public class Divisao extends Operacao{
    @Override
    public double efetuarOperacao(double x, double y) {
        if(y == 0){
            System.out.println("Não é possível dividir por Zero.");
            return 0;
        }else{
            return x / y;
        }
    }
}
