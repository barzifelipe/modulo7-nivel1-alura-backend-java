/* criar um programa que receba um número e simule a subida da escadaria.*/

import java.util.Scanner;

public class Degrau {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de degraus: ");
        int nDegraus = scan.nextInt();
        contador(nDegraus);

    }

    public static void contador(int nDegraus){
        for (int i = 1; i <= nDegraus; i++) {
            System.out.println("Subindo o degrau "+i);
        }
        System.out.println("Você chegou ao topo!");
    }
}
