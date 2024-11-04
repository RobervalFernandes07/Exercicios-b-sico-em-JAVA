package Exercicios2;

import java.util.Scanner;

public class Ex27 {
    public static  void main(String[] args ){
       Scanner entrada = new Scanner(System.in);
       // Escreva um algoritimo que leia 2 números de usuario e exiba quantos números são maiores do que 8.
    int i , numero , quantidade = 0;

    for (i = 0; i < 2; i++){
        System.out.println("Digite um número ");
        numero = entrada.nextInt();
        if (numero > 8 ){
            quantidade ++ ;
        }
    }
        System.out.println("Quantidade de números digitados maiores que 8:" + quantidade);


    }
}
