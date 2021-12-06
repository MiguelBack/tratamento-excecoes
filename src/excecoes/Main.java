package excecoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        try {

            System.out.println("Informe o denominador.");
            int numerador = a.nextInt();
            System.out.println("Agora, informe o denominador.");
            int denominador = a.nextInt();
            System.out.println("Resultado da divisão: " + Calculadora.dividir(numerador, denominador));

        } catch (DivisaoPorZero excecao) {
            System.out.println(excecao.getMessage());
        }

    }

}
