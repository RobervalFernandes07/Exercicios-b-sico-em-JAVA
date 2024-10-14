package Exercicios2;

import java.util.Scanner;

public class Ex10 {
    // Crie um algoritimo que leia e informe se o número é negativo e positivo.

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.println("Escola um número");
        x = entrada.nextInt();
        if( x < 0){
            System.out.println("Número escolhido é negativo");
        } else{
            System.out.println("Número escolhido é positivo");
        }

    }
}
