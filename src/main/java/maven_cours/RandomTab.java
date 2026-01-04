package maven_cours;

import java.util.Random;
/**
 * Test de performances.
 *
 * @author sebastien.choplin@u-picardie.fr (Sebastien Choplin)
 */
public final class RandomTab {
    /** Constructeur privee pour empecher l'instantition de classe. **/
    private RandomTab() { }

    /**
     * Generation d'un tableau d'entiers aleatoires.
     *
     * @param size taille du tableau
     * @return un tableau d'entiers aleatoires
     */
    public static int[] randomTab(final int size) {
	Random rand = new Random();
        int[] tab = new int[size];
        for (int i = 0; i < tab.length; i++) {
	    tab[i] = rand.nextInt();
        }
        return tab;
    }

    /**
     * Programme principal.
     * @param args Arguments du programme (aucun ici)
     */
    public static void  main(final String[] args) {
        System.out.println("Generation du tableau");
        long start = System.currentTimeMillis();
        int[] tab = randomTab(Integer.valueOf(args[0]).intValue());
        long end = System.currentTimeMillis();
        System.out.println("Generation du tableau en " + (end - start) + "ms");
    }
}
