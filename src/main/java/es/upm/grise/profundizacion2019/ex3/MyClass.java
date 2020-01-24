package es.upm.grise.profundizacion2019.ex3;

public final class MyClass {

	// Calcula un tiempo futuro usando el tiempo actual como base
	public void nextTime(final long seconds) {
		final String next = new Time().getFutureTime(seconds);
		System.out.println(next);
	}

}
