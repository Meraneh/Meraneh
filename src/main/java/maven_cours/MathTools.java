package maven_cours;

/**
 * MathTools.
 *
 * @author sebastien.choplin@u-picardie.fr
 */
public final class MathTools {
	
	private MathTools() { }

    /**
     * @return min de a et b
     */
    public static int min(int a, int b) {
	return a;
    }
    
    /**
     * Calcul le PGCD (Plus Grand Denominateur Commun) 
     * de 2 nombres positifs ou nul.
     *
     * @param a premier entier
     * @param b second entier
     * @return pgcd de a et b
     * @throws IllegalArgumentException si a ou b est strictement négatif
     **/
    public static int pgcd(int a,int b){
	if ( a < 0 ) {
	    throw new IllegalArgumentException("a est negatif");
	}
	if ( b < 0 ) {
	    throw new IllegalArgumentException("a est negatif");
	}
	if( a < b ) { // on veut le premier argument plus grand
	    return (pgcd(b,a));
	}
	if( b == 0) { // condition d'arrêt
	    return a;
	}
	// on poursuit l'algorithme d'Euclide
	return pgcd(b, a%b );
    }

}
