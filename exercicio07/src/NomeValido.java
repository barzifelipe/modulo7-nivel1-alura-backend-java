/*crie um programa que continue pedindo um nome até que o usuário insira um valor válido
com pelo menos 3 caracteres.*/

import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        char[] letras = nome.toCharArray();

        do {
            System.out.println("Nome inválido. Digite novamente. ");
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
            letras = nome.toCharArray();

        }while (letras.length < 3);

        System.out.println("Nome " + nome + " cadastrado com sucesso!");
    }
}
