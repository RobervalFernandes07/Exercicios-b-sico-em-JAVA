package Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
   //Crie um algoritimo que leia uma idade de uma pessoa e calcule quantos dias ela viveu

        Scanner entrada = new Scanner(System.in);
        int  idade;
        float Dvida;

        System.out.println("Digite sua idade :");
        idade = entrada.nextInt();
        Dvida = 365 * idade;

        System.out.println("Seus dias de vida na terra são :" + Dvida);

    }
}
