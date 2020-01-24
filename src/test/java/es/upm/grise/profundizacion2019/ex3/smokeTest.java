package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class smokeTest {

	@Test
	public void pruebaDeEstadoTime() {
		final LocalDateTime tiempoActual       = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
		final long          diferenciaDeTiempo = 120;
		final String        tiempoFuturo       = "2020/01/01 00:02:00";
		final Time time = new Time(tiempoActual);
		assertEquals(tiempoFuturo, time.getFutureTime(diferenciaDeTiempo));
	}

	@Test
	public void pruebaDeInteraccionMyClass() {
		final Time time = mock(Time.class);
		final MyClass my = new MyClass(time);
		my.nextTime(new Random().nextLong());
		verify(time, times(1)).getFutureTime(anyLong());
	}

}
