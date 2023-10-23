import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseWordTest {

    //probamos con una sola palabra
	@Test
    public void testReverseWordPalabraSimple() {
        String input = "Hello";
        String expected = "olleH ";
        String result = ReverseWord.reverseWord(input);
        assertEquals(expected, result);
    }
    
    //aqui probamos con una oraciones que contiene más de 1 palabra
    @Test
    public void testReverseWordOracion() {
        String input = "This is a test";
        String expected = "sihT si a tset ";
        String result = ReverseWord.reverseWord(input);
        assertEquals(expected, result);
    }
    
    //se prueba con una cadena vacia
    @Test
    public void testReverseWordCadenaVacia() {
        String input = "";
        String expected = "";
        String result = ReverseWord.reverseWord(input);
        assertEquals(expected, result);
    }

    //probamos con caracteres especiales
    @Test
    public void testReverseWordCaracteresEspeciales() {
        String input = "123!@#$";
        String expected = "321!@#$ ";
        String result = ReverseWord.reverseWord(input);
        assertEquals(expected, result);
    }
}
