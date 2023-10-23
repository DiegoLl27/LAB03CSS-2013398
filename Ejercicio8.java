import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesTest {

    //aquí se hace una prueba con números duplicados al inicio de la cadena
	@Test
    public void testRemoveDuplicatesDuplicadosInicio() {
        List<Integer> numbers = new ArrayList<>(List.of(2, 2, 3, 4, 4, 5));
        List<Integer> expected = new ArrayList<>(List.of(2, 3, 4, 5));
        RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, numbers);
    }
	
	//aquí se hace una prueba con números duplicados al final de la cadena
    @Test
    public void testRemoveDuplicatesDuplicadosFinal() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 5));
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, numbers);
    }

    //aquí se hace una prueba con todos los números duplicados 
    @Test
    public void testRemoveDuplicatesWithDuplicadosTodo() {
        List<Integer> numbers = new ArrayList<>(List.of(7, 7, 7, 7, 7));
        List<Integer> expected = new ArrayList<>(List.of(7));
        RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, numbers);
    }
    
    //aquí se hace una prueba sin números duplicados 
    @Test
    public void testRemoveDuplicatesSinDuplicados() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        RemoveDuplicates.removeDuplicates(numbers);
        assertEquals(expected, numbers);
    }
}
