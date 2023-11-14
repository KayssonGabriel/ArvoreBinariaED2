package app;

import java.util.Arrays;

import sorteio.SorteioNumeros;

public class Main {

    public static void main(String[] args) {
        SorteioNumeros sorteio = new SorteioNumeros();
        int[] numerosSorteados = sorteio.getNumerosSorteados();
        NoArvore arvore = new NoArvore();
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));
        System.out.println();
        System.out.println("Inserindo " + numerosSorteados.length + " números na árvore...");
        System.out.println();


        int i;
        for (i = 0; i < numerosSorteados.length; ++i) {
            if (i == 0) {
                arvore.insereRaiz(arvore, numerosSorteados[i]);
            } else {
                arvore.insere(arvore, numerosSorteados[i]);
            }
        }

        System.out.println("Imprimindo em pre-ordem:");
        arvore.preOrdem(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Imprimindo em in-ordem:");
        arvore.inOrdem(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Imprimindo em pós-ordem:");
        arvore.posOrdem(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Imprimindo em nível:");
        arvore.emNivel(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Retirando 5 elementos da árvore...");

        for (i = 0; i < 5; ++i) {
            arvore = arvore.retira(arvore, numerosSorteados[i]);
        }

        System.out.println("Imprimindo em pre-ordem:");
        arvore.preOrdem(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Imprimindo em in-ordem:");
        arvore.inOrdem(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Imprimindo em pós-ordem:");
        arvore.posOrdem(arvore);
        System.out.println("#################################");
        System.out.println();
        System.out.println("Imprimindo em nível:");
        arvore.emNivel(arvore);
        System.out.println("#################################");
        System.out.println();
    }
}
