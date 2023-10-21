import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio4 {
	
	//HAPPYPATH RESULTADO CORRECTONUMERO POSITIVO
	@Test
    public void testCalculateCubeWithPositiveInput() {
        int result = Operaciones.calculateCube(3);
        assertEquals(27, result);
    }
	//RESULTADO CORRECTO CON 0
    @Test
    public void testCalculateCubeWithZeroInput() {
        int result = Operaciones.calculateCube(0);
        assertEquals(0, result);
    }
    
    //RESULTA CORRECTO CON NUMERO NEGATIVO
    @Test
    public void testCalculateCubeWithNegativeInput() {
        int result = Operaciones.calculateCube(-2);
        assertEquals(-8, result);
    }
    //RESULTADO DIFERENTE
    @Test
    public void testCalculateCubeWithLargeInput() {
        int result = Operaciones.calculateCube(10);
        assertNotEquals(200, result);
    }

}
