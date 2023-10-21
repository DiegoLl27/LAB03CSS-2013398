import org.junit.Test;
import static org.junit.Assert.*;

public class Ejercicio1{
	
	//mandamos el parámetro 5, y en este caso debería dar la suma de 15
    @Test
    public void testAddFirstNumbersExceptionPositive() {
        assertEquals(15, JUnitTest.addFirstNumbersException(5));
    }
    
    //se manda como parámetro a 4, el cual debería dar como resultado 10, pero colocamos un número
    //distinto a la respuesta para que valide que este es un error
    @Test
    public void testAddFirstNumbersExceptionNotEquals() {
        assertNotEquals(-1, JUnitTest.addFirstNumbersException(4));
    }
    
    //mandamos el parámetro 0 para que cumpla con el caso 0
    @Test
    public void testAddFirstNumbersExceptionCero() {
        assertEquals(0, JUnitTest.addFirstNumbersException(0));
    }

    //mandamos el caso -1 para que mande la excepción que tiene la funcion
    @Test(expected = ArithmeticException.class)
    public void testAddFirstNumbersExceptionNegative() {
    	JUnitTest.addFirstNumbersException(-1);
    }
}
