/*crie um programa que conte de 1 até um número digitado pelo usuário, mas ignore números terminados em 5.*/

import java.util.Scanner;

public class PulaNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        for (int i = 1; i <= num ; i++) {
            if(i%10 != 5){
                System.out.printf(i + " ");
            }
        }
    }
}
