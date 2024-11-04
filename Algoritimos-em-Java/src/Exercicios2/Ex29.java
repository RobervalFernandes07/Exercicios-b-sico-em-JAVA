package Exercicios2;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] agrs){
        //Escreva um algoritimo que leia 20 números do usuário e exiba quantos números são pares.
        Scanner entrada = new Scanner(System.in);
        int i , numero, quantidade = 0;

        for ( i =0; i < 5; i++){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0){
                quantidade++;
            }
        }
        System.out.printf("Quantidade de números digitados que são pares: " + quantidade);
    }
}
