package br.dio.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        Double number = in.nextDouble();
        char[] individuals = number.toString().toCharArray();

        for(char value:individuals){
            System.out.print(value + " ");
        }
    }
}
