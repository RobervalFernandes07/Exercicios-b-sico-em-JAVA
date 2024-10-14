package Exercicios2;

import java.util.Scanner;
// Crie um algoritimo para indicar , como está a temperatura
public class Ex16 {
    public static void main(String [] args){
        Scanner entrada =  new Scanner(System.in);

        int temperatura;

        System.out.println("Digite a temperatura atual: ");
        temperatura = entrada.nextInt();

        if(temperatura <= 18){
            System.out.println("O clima está frio.");
        } else if ((temperatura >= 19) && (temperatura <= 23)) {
            System.out.println("O clima está agradavél.");
        } else if ((temperatura >=24) && (temperatura <= 35)){
            System.out.println("O clima esta quente.");
        }else{
            System.out.println(" O clima está acima do normal , muito quente.");
        }
    }
}
