package main;

import java.util.Scanner;
public class calculadora_somar_simples {

    public static void main(String[] args){
      
  Scanner pegador = new Scanner(System.in);

    int numero1=0;
    int numero2=0;
// System.out.println("");

    System.out.println("---Calculadora somar simples---");
    System.out.println("qual e o primeiro numero???");
    numero1=pegador.nextInt();
    System.out.println("adcionado!!");
    System.out.println("qual e o segundo numero");
    numero2=pegador.nextInt();
    int resultado=numero1 + numero2;


    System.out.println("o resultado dessa conta foi: "+ resultado);

    System.out.println("fim do progama.");
    }
}
