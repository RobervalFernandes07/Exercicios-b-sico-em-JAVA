package Exercicios2;

import java.util.Scanner;

public class Ex25 {

    // Escreva um algoritmo que leia 10 números de usuário e calcule a soma desses números, e utilize a repetição (While).
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x, soma, numero;

        x = 1;
        soma = 0;

        while (x <= 10) {
            System.out.println("Digite o número:");
            numero = entrada.nextInt();
            soma = soma + numero;
            System.out.println("Número digitado: " + numero);
            System.out.println("Soma até agora: " + soma);
            x++;
        }

        System.out.println("A soma dos números digitados é: " + soma);
        entrada.close();
    }
}