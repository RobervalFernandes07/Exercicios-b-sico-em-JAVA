package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        //Crie um algoritimo que lê dois números inteiro , X e Y , e mostre o resultado da multiplicação.
        Scanner entrada = new Scanner(System.in);

        int x, y , resultado;

        System.out.println("Digite primeiro número");
        x = entrada.nextInt();
        System.out.println("Digite o segundo número");
        y = entrada.nextInt();
        resultado = x * y ;

        System.out.println("O resultado de x * y é : " + resultado);

    }
}
