package excecoes;

public class Calculadora {

    public static double dividir(int numerador, int denominador) throws DivisaoPorZero {

        if (denominador == 0) {
            throw new DivisaoPorZero("Não é possível dividir um número por zero.");
        }

        return numerador / denominador;
    }

}
