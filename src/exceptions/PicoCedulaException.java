package exceptions;

public class PicoCedulaException extends Exception {
	
	public PicoCedulaException(){
		super("El cliente no pudo ser añadido porque no es su dia de pico y cedula");
	}
}
