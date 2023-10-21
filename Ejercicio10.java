mport static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class Ejercicio10 {

	@Test
    public void testAddWithValidList() {
        // Este es el "happy path" donde la lista de números es válida y no está vacía.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = Operaciones.add(numbers);
        assertEquals(15, result);
    }

    @Test
    public void testAddWithEmptyList() {
        // Caso en el que la lista de números está vacía.
        List<Integer> emptyList = Arrays.asList();
        assertThrows(NullPointerException.class, () -> {
            Operaciones.add(emptyList);
        });
    }

}
