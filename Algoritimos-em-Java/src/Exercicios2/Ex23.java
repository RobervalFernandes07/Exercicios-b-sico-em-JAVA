package Exercicios2;

public class Ex23 {

    // Escreva um algoritomo que calcule a soma dos números de 1 a 15 , utilizando while
    public static void main(String[] args) {
        int x, soma;
        x = 1;

        soma = 0;
        while (x <= 15) {
            soma = soma + x;
            x = x + 1;
        }
        System.out.println(" Soma dos números de 1 a 15 é:" + soma);
    }
}
