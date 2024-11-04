package Exercicios2;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args){
        //Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exibe: o nome e a idade da pessoa mais velha.

        Scanner entrada = new Scanner(System.in);

        int idade, idadeMaisVelha = 0;
        String nome, nomeMaisVelha = "";

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome: ");
            nome = entrada.nextLine();
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();
            entrada.nextLine(); // Limpar o buffer

            if (idade > idadeMaisVelha) {
                nomeMaisVelha = nome;
                idadeMaisVelha = idade;
            }
        }

        System.out.println("Pessoa mais velha - Nome: " + nomeMaisVelha + " Idade: " + idadeMaisVelha);
    }
}
