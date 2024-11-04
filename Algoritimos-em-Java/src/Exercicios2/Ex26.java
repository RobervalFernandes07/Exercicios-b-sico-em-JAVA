package Exercicios2;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, x;

        soma = 0;


        for (x = 1; x <= 15; x++) {
            System.out.println("Digite um número:");
            numero = entrada.nextInt();
            soma = soma + numero;

            System.out.println("A soma até agora é: " + soma);
        }

        System.out.println("A soma dos números digitados é: " + soma);
        entrada.close();  // Fechar o Scanner
    }
}
