package Exercicios2;

import java.util.Scanner;

//Crie um algoritimo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.
public class Ex15 {
    public static void main(String[]args){
        int x;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        x = entrada.nextInt();

        if( x % 5 == 0){
            System.out.println("O número " + x + " é multiplo de 5.");
        } else{
            System.out.println("O número " + x + " NÃO é multiplo de 5.");
        }
    }
}
