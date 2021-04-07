package exceptions;


public class MinorException extends Exception{

	public MinorException(){
		super("El cliente no pudo ser añadido porque es menor de edad");
	}
}