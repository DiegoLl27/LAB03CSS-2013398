import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio6 {
	// Este es el "happy path" donde n1 es mayor que n2.
	@Test
    public void testCompareTwoNumbersWithN1GreaterThanN2() {
        int result = Operaciones.compareTwoNumbers(5, 3);
        assertEquals(1, result); // Esperamos que la función devuelva 1.
    }
    // Caso en el que n1 es menor que n2.
    @Test
    public void testCompareTwoNumbersWithN1LessThanN2() {
        int result = Operaciones.compareTwoNumbers(2, 6);
        assertEquals(-1, result); // Esperamos que la función devuelva -1.
    }
    // Caso en el que n1 es igual a n2.
    @Test
    public void testCompareTwoNumbersWithN1EqualToN2() {
        int result = Operaciones.compareTwoNumbers(4, 4);
        assertEquals(0, result); // Esperamos que la función devuelva 0.
    }
    
 // Caso en el se prueba que el valor retornado no sea igual a 0
    @Test
    public void testCompareTwoNumbersWithNegativeNumbers() {
        // Caso en el que ambos números son negativos.
        int result = Operaciones.compareTwoNumbers(-3, -6);
        assertNotEquals(0, result); // Debe retornar 1, ya que -3 es mayor que -6.
    }

}
