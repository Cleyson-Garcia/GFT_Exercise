package br.dio.exercicio1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int multiplicando, inicio, fim;

        System.out.print("Multiplicando: ");
        multiplicando = in.nextInt();
        System.out.print("Início do Intervalo: ");
        inicio = in.nextInt();
        System.out.print("Fim do Intervalo: ");
        fim = in.nextInt();

        if(multiplicando < 0 || multiplicando > 3000){
            System.out.print("O multiplicando não pode ser negativo e não pode ser maior que 3000.");
        }else if(inicio < 0 || inicio > 3000){
            System.out.print("O inicio não pode ser negativo e não pode ser maior que 3000.");
        }else if(fim < 0 || fim > 3000){
            System.out.print("O fim não pode ser negativo e não pode ser maior que 3000.");
        }else if(inicio >= fim) {
            System.out.print("O fim não pode ser menor do que o início.");
        }else if(fim - inicio >= 10){
                System.out.print("O intervalo não pode ter uma diferença maior que 10.");
        }else{
            for(int i = inicio; i <= fim; i++){
                System.out.println(multiplicando + " x " + i + " = " + (multiplicando*i));
            }
        }
    }
}
