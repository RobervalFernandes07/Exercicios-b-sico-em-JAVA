package Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
     // Crie um algoritimo que lê o salário de um funcionario , reajusta o sálario em 7% e mostra o resultado.
        Scanner entrada = new Scanner(System.in);

        double salario, novoSalario , reajuste;
        String nome;
        System.out.println("Digite o nome do funcionario");
        nome = entrada.nextLine();
        System.out.println("Digite o salario do funcionario:");
        salario =entrada.nextDouble();
        reajuste = salario * 0.07;
        novoSalario = salario + reajuste;
        System.out.println("O funcionario " + nome + ", recebera o novo salario no valor :" + novoSalario);

    }
}
