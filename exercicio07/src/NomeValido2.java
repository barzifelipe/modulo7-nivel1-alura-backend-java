/*crie um programa que continue pedindo um nome até que o usuário insira um valor válido
com pelo menos 3 caracteres.*/

import java.util.Scanner;

public class NomeValido2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

        do{
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();
            if(nome.length() < 3){
                System.out.println("Nome inválido. Digite novamente. ");
            }
        }while(nome.length() < 3);
        System.out.println("Nome " + nome + " cadastrado com sucesso!");
    }
}
