package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class smokeTest {

	// La instancia de la clase MyClass a testear
	MyClass my;

	@Before
	public void setUp() {
		my = new MyClass();
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}

	@Test
	public void pruebaDeEstadoTime() {
		final LocalDateTime tiempoActual       = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
		final long          diferenciaDeTiempo = 120;
		final String        tiempoFuturo       = "2020/01/01 00:02:00";
		final Time time = new Time(tiempoActual);
		assertEquals(tiempoFuturo, time.getFutureTime(diferenciaDeTiempo));
	}
	
}
