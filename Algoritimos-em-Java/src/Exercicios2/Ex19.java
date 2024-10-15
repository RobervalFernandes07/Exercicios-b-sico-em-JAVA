package Exercicios2;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        // Escreva um algoritimo que leia dois números e aprensente um menu com 4 opções:
        // 1 - Somar os números , 2 - Subtrair os números , 3 - Multiplicar os números , 4 - Dividir os números.

        Scanner entrada = new Scanner(System.in);

        int n1 , n2 , opcao , resultado;

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("Escolha a opção : [1- Somar] , [2- Subtrair] , [3- Multiplicar] , [4- Dividir] ");
        opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                resultado = n1+n2;
                System.out.println("O resultado é  " + resultado);
                break;
            case 2:
                resultado = n1-n2;
                System.out.println("O resultado é  " + resultado);
            case 3:
                resultado = n1*n2;
                System.out.println("O resultado é " + resultado);
            case 4:
                resultado = n1/n2;
                System.out.println("O resultado é " + resultado);
            default:
                System.out.println("Opcão invalida !!!");
        }

    }
}
