package Exercicios2;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String sexo;

        System.out.println("Escolha a opção : ( F - Feminino / M - Masculino) ");
        sexo = entrada.nextLine();

        if(sexo.equals("M") || sexo.equals("m")){
            System.out.println("Seja bem-vindo , Senhor.");
        } else{
            System.out.println("Seja bem-vindo, Senhora.");
        }
    }
}
