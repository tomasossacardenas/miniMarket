package exceptions;

@SuppressWarnings("serial")
public class MinorException extends Exception{

	public MinorException(){
		super("El cliente no pudo ser a�adido porque es menor de edad");
	}
}