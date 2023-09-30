package EstruturaDecisao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salario "); // console.log
        double salario = Double.parseDouble(leitor.nextLine());
        if (salario < 1000) {
            double salarioreajustado = salario * 1.1;
            System.out.println(salarioreajustado);
        } else {
            System.out.println("salario sem reajuste");
        }

    }


}
