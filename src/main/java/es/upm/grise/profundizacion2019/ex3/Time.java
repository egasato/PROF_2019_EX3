package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Time {

	// El formato del tiempo y fecha es constante
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	// La instancia usada para calcular la diferencia de tiempo
	private LocalDateTime time;
	
	// Un constructor que inyecta la dependencia
	public Time(final LocalDateTime time) {
		this.time = time;
	}

	// Un constructor vacío utiliza el tiempo actual por defecto
	public Time() {
		this(LocalDateTime.now());
	}

	// Un método que computa un tiempo futuro
	// PD: Teoricamente la clase LocalDateTime es inmutable, por lo que he
	//     asumo que hay que asignar el objeto retornado por "plusSeconds"
	public String getFutureTime(final long seconds) {
		final LocalDateTime future = time.plusSeconds(seconds);
		return formatter.format(future);	
	}

}
