import static org.junit.Assert.*;

import org.junit.Test;


public class BaskaraTest {

	@Test
	public void deveTestarDeltaIgualAZero() throws BaskaraException {
		double [] resultado = Baskara.calcular(1,8,16);
		double[] raizes = {-4.0,-4.0};
		assertArrayEquals(raizes,resultado,0);
		
	}
	
	@Test
	public void deveTestarDeltaMaiorQueZero() throws BaskaraException {
		double [] resultado = Baskara.calcular(1,-2,-3);
		double[] raizes = {3,-1};
		assertArrayEquals(raizes,resultado,0);
		
	}
	
	@Test(expected = BaskaraException.class)
	public void deveTestarDeltaMenorQueZero() throws BaskaraException {
		double [] resultado = Baskara.calcular(10,6,10);
		
	}

}
