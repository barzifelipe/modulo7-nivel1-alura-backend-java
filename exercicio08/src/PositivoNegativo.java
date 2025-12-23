/*criar um programa que permita inserir vários números, um por vez, e que
pare quando o número "fim" for digitado. */

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String entrada;
        int contPos = 0;
        int contNeg = 0;

        do {
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            entrada = scan.nextLine();

            if(entrada.equals("fim")){
                break;
            }
            else {
                int num = Integer.parseInt(entrada);

                if(num > 0){
                    contPos++;
                }
                else {
                    contNeg++;
                }
            }

        }while (!entrada.equals("fim"));

        System.out.println("Números positivos: "+contPos);
        System.out.println("Números negativos: "+contNeg);
    }
}
