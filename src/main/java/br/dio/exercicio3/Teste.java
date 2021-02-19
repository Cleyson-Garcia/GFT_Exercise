package br.dio.exercicio3;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        Scanner in = new Scanner(System.in);
        double x,y;

        System.out.print("Digite o primeiro parâmetro: ");
        x = in.nextDouble();
        System.out.print("Digite o segundo parâmetro: ");
        y = in.nextDouble();

        System.out.println("A soma entre os dois parâmetros é " + soma.efetuarOperacao(x,y));
        System.out.println("A subtração entre os dois parâmetros é " + subtracao.efetuarOperacao(x,y));
        System.out.println("A multiplicação entre os dois parâmetros é " + multiplicacao.efetuarOperacao(x,y));
        System.out.println("A divisão entre os dois parâmetros é " + divisao.efetuarOperacao(x,y));
    }
}
