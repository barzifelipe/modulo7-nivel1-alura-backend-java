/*Crie um programa que receba um número e calcule seu fatorial.*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);

        int fatorial = 1;

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
