import org.junit.Test;
import static org.junit.Assert.*;


class Ejercicio2 {
	
	//se busca comprobar que el primer número sea mayor
	@Test
    public void testFindHighestNumber1() {
        assertEquals(6, JUnitTest.findHighestNumber(6,4,5));
    }
	
	//se busca comprobar que el segundo número sea mayor
	@Test
    public void testFindHighestNumber2() {
        assertEquals(7, JUnitTest.findHighestNumber(6,7,5));
    }
	
	//se busca comprobar que el tercer número sea mayor
	@Test
    public void testFindHighestNumber3() {
        assertEquals(8, JUnitTest.findHighestNumber(6,7,8));
    }
	
	//En este caso se mandan 3 números iguales, y se espera que estos parámetros arroje no sea igual a 
	//, ya que la función solo bota cual es el número mayor y no si estos son iguales. 
	@Test
    public void testFindHighestNumber4() {
        assertNotEquals(7, JUnitTest.findHighestNumber(7,7,7));
    }
}
