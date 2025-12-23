
import java.util.ArrayList;
import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<String> convidados = new ArrayList<>();

        do{
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            String entrada = scan.nextLine();

            if(entrada.equalsIgnoreCase("ver")){
                System.out.println("Lista atualizada de convidados: " +convidados);
                continue;
            }

            else if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado.");
                break;
            }


            if (convidados.contains(entrada)) {
                System.out.println("O nome " + entrada + " já está na lista de convidados.");
            }
            else{
                convidados.add(entrada);
                System.out.println(entrada +" foi adicionado à lista de convidados.");
            }


        }while(true);
    }
}
