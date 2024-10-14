package Exercicios2;

import java.util.Scanner;

// Crie um algoritimo que leia um número do usúario e informe se e o número é par ou impar
public class Ex13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int x;

        System.out.println("Digite um número: ");
        x = entrada.nextInt();

        if( x % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }

    }
}
