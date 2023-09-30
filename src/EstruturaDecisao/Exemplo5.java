package EstruturaDecisao;

import java.util.Scanner

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade;

        do {
            System.out.println("Digite a sua idade: ");
            idade = leitor.nextInt();
            } while (idade<18);
        System.out.println("Maior que 18 anos");


    }
}

