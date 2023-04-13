package atividade24;

import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeticoes;
        System.out.print("Digite a quantidade de repetições desejadas: ");
        repeticoes = scan.nextInt();
        for(int i = 1; i <= repeticoes; i++){
            System.out.print("Digitie um número: ");
            int numero = scan.nextInt();
            if(numero == 0){
                System.out.println("Zero");
            }else if(numero > 0){
                System.out.println("Numero positivo");
            }else{
                System.out.println("Numero negativo");
            }
        }
    }
}
