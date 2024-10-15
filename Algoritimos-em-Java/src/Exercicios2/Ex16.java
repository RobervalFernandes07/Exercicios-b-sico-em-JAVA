package Exercicios2;

import java.util.Scanner;
// Um algoritimo que leia temperatura e saiba idenficar o valor e dizer como esta o clima .
public class Ex16 {

 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura atual: ");
        int temperatura = entrada.nextInt();
        if (temperatura <= 18) {
            System.out.println("O clima está frio");
        } else if (temperatura >= 19 && temperatura <= 23) {
            System.out.println("O clima está agradavél");
        } else if (temperatura >= 24 && temperatura <= 35) {
            System.out.println("O clima esta quente");
        } else {
            System.out.println(" O clima está acima do normal , muito quente");
        }

    }
}
