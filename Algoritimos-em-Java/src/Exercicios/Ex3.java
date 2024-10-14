package Exercicios;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        // Crie um algoritimo que leia um número inteiro e mostre seu antecessor.

        Scanner entrada = new Scanner(System.in);

        int x , antecessor;

        System.out.println("Digite um numero: ");
        x = entrada.nextInt();
        antecessor = x -1;

        System.out.println("O antecessor de x é :" + antecessor);

    }
}
