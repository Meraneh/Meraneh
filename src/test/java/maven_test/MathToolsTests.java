package maven_test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 

import maven_cours.MathTools;
import maven_cours.RandomTab;

/**
 * Tests for MathTools.
 *
 * @author sebastien.choplin@u-picardie.fr
 */
public class MathToolsTests {

    @Test
    public void testMin() {
	assertEquals(2,MathTools.min(2,5));
    }
    
    @Test
    public void testPgcd() {
	assertEquals(8,MathTools.pgcd(24,16));
	assertEquals(10,MathTools.pgcd(0,10));
	assertEquals(0,MathTools.pgcd(0,0));
    }

    @Test
    public void testPgcdArguments1() {
    	assertThrows(IllegalArgumentException.class,() -> MathTools.pgcd(-1, 1));
    }
   
    @Test
    public void testPgcdArguments2() {
    	assertThrows(IllegalArgumentException.class,() -> MathTools.pgcd(1, -1));
    }

    
    
    @Test
    void randomTab_retourneTableauDeBonneTaille() {
        int[] tab = RandomTab.randomTab(10);
        //assertNotNull(tab);
        assertEquals(10, tab.length);
    }

    @Test
    void randomTab_sizeZero_retourneTableauVide() {
        int[] tab = RandomTab.randomTab(0);
        //assertNotNull(tab);
        assertEquals(0, tab.length);
    }

  
}
