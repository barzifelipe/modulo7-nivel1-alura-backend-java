/*crie um programa que peça uma senha ao usuário e permita até 3 tentativas de erro
antes de bloquear o acesso. Se o usuário digitar corretamente antes disso, o sistema
deve conceder o acesso imediatamente.*/

import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int senha = 1234;
        int tentativa = 3;

        do{
            tentativa--;
            System.out.println("Digite sua senha: ");
            int senhaLida = scan.nextInt();

            if(senhaLida == senha){
                 System.out.println("Senha Correta! Acesso concedido!");
                 break;
            }
            else if(tentativa == 0){
                System.out.println("Conta bloqueada temporariamente.");
                break;

            }
            else {
                System.out.println("Senha incorreta. Você tem " + tentativa + " tentativa(s) restante(s). ");
            }

        }while(tentativa > 0);



    }
}
