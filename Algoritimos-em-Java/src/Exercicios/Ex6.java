package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int  x, y , resto;

        System.out.println("Digite o valor de X:");
        x = entrada.nextInt();
        System.out.println("Digite o valor de Y:");
        y = entrada.nextInt();
        resto = x % y;

    System.out.println("O resto da divisão é :" + resto);
    }
}
