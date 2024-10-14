package Exercicios2;

import java.util.Scanner;

// Crie uma algoritimo que leia dois valores x e y e informe se eles são iguais.
public class Ex11 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int x,y;

        System.out.println("Digite um valor : ");
        x = entrada.nextInt();

        System.out.println("Digite outro valor :");
        y = entrada.nextInt();

        if(x == y ){
            System.out.println("Esse valores são iguais.");
        } else{
            System.out.println("Valores diferentes");
        }


    }
}
