package Exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        // Crie um algoritimo que leia um número inteiro e msotre seu sucessor.

    Scanner entrada = new Scanner(System.in);

    int x , sucessor;
        System.out.println("Digite um número");
        x = entrada.nextInt();

        sucessor = x +1;

        System.out.println("O sucessor de x é " + sucessor);
    }
}
