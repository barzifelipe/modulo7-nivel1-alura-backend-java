/**/

import java.util.Scanner;

public class Maior {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[5];
        int maior = 0;

        System.out.println("Digite números: ");

        for (int i = 0; i < vet.length; i++) {
            vet[i] = scan.nextInt();
            if (vet[i] > maior){
                maior = vet[i];
            }
        }

        System.out.print(maior);
    }
}
