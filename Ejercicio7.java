import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArraySortTest {

    //aqui se comprueba con numeros positivos
    @Test
    public void testSortArrayNumerosPositivos() {
        int[] array = {5, 2, 9, 1, 5};
        int[] expected = {1, 2, 5, 5, 9};
        ArraySort.sortArray(array);
        assertArrayEquals(expected, array);
    }


    //aqui se comprueba con 2 cadenas de números negativos
    @Test
    public void testSortArrayNumerosNegativos() {
        int[] array = {-3, -8, -1, -5, -2};
        int[] expected = {-8, -5, -3, -2, -1};
        ArraySort.sortArray(array);
        assertArrayEquals(expected, array);
    }

    //aqui se comprueba con 2 cadenas iguales
    @Test
    public void testSortArrayIguales() {
        int[] array = {3, 1, 4, 1, 5, 2, 4};
        int[] expected = {1, 1, 2, 3, 4, 4, 5};
        ArraySort.sortArray(array);
        assertArrayEquals(expected, array);
    }

    //Aqui se verifica con 2 cadenas vacias
    @Test
    public void testSortArrayVacios() {
        int[] array = {};
        int[] expected = {};
        ArraySort.sortArray(array);
        assertArrayEquals(expected, array);
    }
}
