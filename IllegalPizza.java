/**
 * An Exception thrown by the Pizza Object if parameters are not legal.
 * @author Maita Kambarami
 * @version 1.0
 */
public class IllegalPizza extends Exception {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalPizza() {
		super("Illegal parameter value supplied to Pizza object.");
	}

	/**
	 * Passes along the message supplied to the exception.
	 * @param message A more specific message.
	 */
	public IllegalPizza(String message) {
		super(message);
	}

}
