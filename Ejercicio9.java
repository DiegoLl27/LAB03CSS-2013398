import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio9 {

	@Test
    public void testDivTwoNumbersWithValidDivision() {
        // Este es el "happy path" donde la división es válida.
        double result = Operaciones.divTwoNumbers(10, 2);
        assertEquals(5.0, result, 0.001); // Esperamos que la función devuelva 5.0 con un pequeño margen de error.
    }

    @Test
    public void testDivTwoNumbersWithDivisionByZero() {
        // Caso en el que se intenta dividir por cero, lo que debería arrojar una excepción.
        assertThrows(IllegalArgumentException.class, () -> {
        	Operaciones.divTwoNumbers(5, 0);
        });
    }

    @Test
    public void testDivTwoNumbersWithNegativeNumbers() {
        // Caso de división con números negativos.
        double result = Operaciones.divTwoNumbers(-6, 2);
        assertEquals(-3.0, result, 0.001); // Esperamos que la función devuelva -3.0 con un pequeño margen de error.
    }

    @Test
    public void testDivTwoNumbersWithNonZeroDenominator() {
        // Caso de división con el denominador distinto de cero.
        double result = Operaciones.divTwoNumbers(8, 3);
        assertNotEquals(0.0, result); // Esperamos que el resultado no sea igual a 0.
    }

}
