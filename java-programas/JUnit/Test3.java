package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test3{
    private Test3 parseador = new Test3();

	public double obtenerResultado(final String ecuacion) {

		int parte1 = parseador.obtenerParte1(ecuacion);
		int parte2 = parseador.obtenerParte2(ecuacion);
		int parte3 = parseador.obtenerParte3(ecuacion);
		double resultado = Double.valueOf((parte3 - parte2)) / Double.valueOf(parte1);
		return resultado;
	}
    public int obtenerParte1(final String ecuacion) {

		String[] partes1 = obtenerPartes12(ecuacion);

		String parte1 = partes1[0].trim();

		return Integer.valueOf(parte1.substring(0, parte1.length() - 1));
	}

	public int obtenerParte2(final String ecuacion) {

		String[] partes1 = obtenerPartes12(ecuacion);

		String parte2 = partes1[1].trim();

		String operador = obtenerOperador(ecuacion);

		if ("-".equals(operador)) {
			return Integer.valueOf(parte2) * (-1);
		}

		return Integer.valueOf(parte2);
	}

	public String obtenerOperador(final String ecuacion) {
		if (ecuacion.indexOf('+') > 0) {
			return "+";
		} else {
			return "-";
		}
	}

	public int obtenerParte3(final String ecuacion) {
		String[] partesEcuacion = ecuacion.split("=");
		return Integer.valueOf(partesEcuacion[1].trim());
	}

	private String[] obtenerPartes12(final String ecuacion) {
		String[] partesEcuacion = ecuacion.split("=");

		String operador = obtenerOperador(ecuacion);

		String[] partes1 = partesEcuacion[0].split("\\" + operador);

		return partes1;
	}
    @Test
	public void obtenerParte1Unidades() {

		String ecuacion1 = "2x - 1 = 0";

		int resultado = parseador.obtenerParte1(ecuacion1);

		assertEquals(2, resultado);
	}


	@Test
	public void obtenerParte2Suma() {

		String ecuacion1 = "2x + 1 = 0";

		int resultado = parseador.obtenerParte2(ecuacion1);

		assertEquals(1, resultado);
	}

	@Test
	public void obtenerParte3Positivo() {

		String ecuacion1 = "2x + 1 = 3";

		int resultado = parseador.obtenerParte3(ecuacion1);

		assertEquals(3, resultado);
	}

	@Test
	public void obtenerOperadorSuma() {

		String ecuacion2 = "2x + 1 = 0";

		String operador = parseador.obtenerOperador(ecuacion2);

		assertEquals("+", operador);
	}

}
