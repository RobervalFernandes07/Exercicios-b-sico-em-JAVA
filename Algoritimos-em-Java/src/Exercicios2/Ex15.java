package Exercicios2;

import java.util.Scanner;

    public class Ex15 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o valor: ");
            int x = entrada.nextInt();
            if (x % 5 == 0) {
                System.out.println("O número " + x + " é multiplo de 5.");
            } else {
                System.out.println("O número " + x + " NÃO é multiplo de 5.");
            }

        }
    }

