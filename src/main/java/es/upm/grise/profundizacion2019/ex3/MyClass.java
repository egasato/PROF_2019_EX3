package es.upm.grise.profundizacion2019.ex3;

public final class MyClass {

	// La instancia usada para calcular el tiempo
	private Time time;

	// Un constructor que inyecta la dependencia
	public MyClass(final Time time) {
		this.time = time;
	}

	// Calcula un tiempo futuro usando el tiempo actual como base
	public void nextTime(final long seconds) {
		final String next = time.getFutureTime(seconds);
		System.out.println(next);
	}

}
