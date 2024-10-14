package Exercicios;

import java.util.Scanner;
// Conversão de Real para Dólar
public class Ex8 {
    public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);

     double ValorR=1.00 , ValorD=5.00 , ValorConvertido;

            System.out.println("Digite o valor em real :");
            ValorR = entrada.nextDouble();
            ValorConvertido = ValorR * ValorD;

            System.out.println("Seu valor convertido de real para dólar :" + ValorConvertido);
        }
    }



