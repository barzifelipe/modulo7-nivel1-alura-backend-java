/* Crie um programa que receba uma lista de números e encontre o maior número.*/

import java.util.Scanner;

public class MaiorV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os números separados por espaço: ");
        String[] vet = scan.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for(String numStr : vet){
            int num = Integer.parseInt(numStr);
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: ");
    }
}
