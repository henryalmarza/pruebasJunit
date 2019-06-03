import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.junit.Assert;

import com.junit.pruebas.services.Calculadora;
import com.junit.pruebas.services.CalculadoraAvanzada;

public class TestCalculadora {
	
	@Test
	public void testSumar() {
		int a= 5;
		int b= 3;
		
		Calculadora calc = new Calculadora();
		
		boolean validacion = false;
		
		if( ((a>0)||(b>0))&&(calc.sumar(a, b)>0) ) {
			validacion = true;
		}
		
		//Assert.assertEquals(calc.sumar(a, b),8);
		Assert.assertTrue(validacion);
	}
	
	@Test
	public void testSumarMultiplicar() {
		int a= 5;
		int b= 3;
		int c= 2;
		
		CalculadoraAvanzada calcAvanzada = new CalculadoraAvanzada();
		
		Calculadora calc = mock(Calculadora.class);
		when(calc.sumar(a,b)).thenReturn(8);
		
		calcAvanzada.setCalc(calc);
		
		boolean validacion = false;
		
		if( ((a>0)||(b>0)||(c>0))&&(calcAvanzada.sumarMultiplicar(a, b, c)>0) ) {
			validacion = true;
		}
		
		//Assert.assertTrue(validacion);
		Assert.assertEquals(calcAvanzada.sumarMultiplicar(a, b, c),16);
	}

}
