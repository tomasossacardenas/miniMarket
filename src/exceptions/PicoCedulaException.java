package exceptions;

@SuppressWarnings("serial")
public class PicoCedulaException extends Exception {
	
	public PicoCedulaException(){
		super("El cliente no pudo ser a�adido porque no es su dia de pico y cedula");
	}
}
