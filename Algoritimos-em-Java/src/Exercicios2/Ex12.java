package Exercicios2;

import java.util.Scanner;

//Crie um algoritimo que leia dois valores x e y , e informe qual o maior valor.
public class Ex12 {
   public  static  void main(String[] args){

       Scanner entrada = new Scanner(System.in);
       int x , y;
       System.out.println("Digite o primeiro valor: ");
       x = entrada.nextInt();
       System.out.println("Digite o segundo valor:");
       y = entrada.nextInt();

       if( x > y ){
           System.out.println("X é maior que Y .");
       } else if(x < y){
           System.out.println("Y é maior que X");
       }else{
           System.out.println("Eles são iguais !");
       }
   }


}
