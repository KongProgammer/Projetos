package main.java.projetos.boletimSistema;

import java.util.Scanner;
public class nota {
    public static void main(String[] args){
        //System.out.println("");

        Scanner pegador = new Scanner(System.in);



        String nome="";
        int nota1=0;
        int maxnota=4;
        int faltas=0;
        int maxfaltas=20;


        System.out.println("---Iniciando notaSystem---");
        System.out.println("qual e o nome do aluno");
        nome=pegador.nextLine();

        System.out.println("qual e a nota final do aluno");
        nota1=pegador.nextInt();
        
        System.out.println("quantas veses ele faltou na aulas");
        faltas=pegador.nextInt();

        if(nota1 >= maxnota && faltas >= maxfaltas){
            System.out.println("ele passou de ano");

        }else if(nota1 > 5){
            System.out.println("ele ficou de recuperaçao");

        } else  {
            System.out.println("ele nao passou de ano");

        }

        System.out.println("fim do progama");



 
    

    }
}
