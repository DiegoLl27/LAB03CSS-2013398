import org.junit.Test;
import static org.junit.Assert.*;



class Ejercicio3 {
	
	//se busca comprobar el número mayor entre 5 números
	@Test
    public void testFindMaxNumber1() {
		int[] i;
		i= new int[5];
        assertEquals(5, JUnitTest.findMaxNumber(i));
    }
	
	//se busca comprobar que hay un error cuando se pone una cadena del 1 al 4, pero se pone como 
	//respuesta el número 2
	@Test
    public void testFindMaxNumber2() {
		int[] i;
		i= new int[4];
        assertNotEquals(2, JUnitTest.findMaxNumber(i));
    }
	
	@Test
    public void testFindMaxNumber3() {
		int[] i;
		i= new int[-1];
        assertEquals(0, JUnitTest.findMaxNumber(i));
    }
	
	@Test
    public void testFindMaxNumber4() {
		int[] i;
		i= new int[4];
        assertEquals(4, JUnitTest.findMaxNumber(i));
    }
	
}
