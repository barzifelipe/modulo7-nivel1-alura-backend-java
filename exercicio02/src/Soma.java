/*Crie um programa que calcule o valor total.*/

public class Soma {
    public static void main(String[] args){
        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        System.out.println("A soma total é: "+ soma);
    }
}
