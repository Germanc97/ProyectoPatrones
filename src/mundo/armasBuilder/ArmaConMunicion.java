package mundo.armasBuilder;

public interface ArmaConMunicion {

	/**
	 * obtiene la munici�n del arma en cuesti�n
	 * @return munici�n
	 */
	byte getMunicion();
	/**
	 * cambia la munici�n del arma presente
	 * @param municion
	 */
	ArmaConMunicion setMunicion(byte municion);
}
