package Exercicios2;

import java.util.Scanner;

public class Ex17 {

    // Construa um algoritimo que leia o usuario e salário

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextDouble();
        if (salario <= 1412){
            System.out.println("Até um salário minimo.");

        } else if ((salario > 1412)&&(salario <= 1824)) {
            System.out.println("Até 2 salário mínimo.");

        } else if ((salario > 1825) &&(salario <= 7060)) {
            System.out.println("Até 5 salários mínimos");

        }else{
            System.out.println("Acima de 5 salários mínimos");
        }
    }
}
