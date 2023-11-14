package sorteio;

import java.util.Random;

public class SorteioNumeros {
    private static final Random random = new Random();
    private static final int QTDNUMEROS = 20; // Adicionei a quantidade desejada

    private int[] numerosSorteados;

    public SorteioNumeros() {
        numerosSorteados = new int[QTDNUMEROS];
        sortearNumeros();
    }

    private void sortearNumeros() {

        for (int i = 0; i < numerosSorteados.length; i++) {
            int numero = random.nextInt(101);
            numerosSorteados[i] = numero;
        }
    }

    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }
}
