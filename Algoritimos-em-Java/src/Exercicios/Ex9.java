package Exercicios;

import java.util.Scanner;

// Algoritimo que solicite nome , endereço e telefone do usuario.
public class Ex9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nome, endereco;
        int telefone;

        System.out.println("Olá , digite seu nome:" );
        nome = entrada.nextLine();
        System.out.println("Digite seu endereço:");
        endereco = entrada.nextLine();
        System.out.println("Digite seu número de telefone:");
        telefone = entrada.nextInt();

        System.out.println("Seu nome é " + nome + " , endereço " + endereco + ", número para contato " + telefone + ".");


    }
}
