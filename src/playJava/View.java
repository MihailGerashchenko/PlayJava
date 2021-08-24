package playJava;

/**
 * Created by User on 24.08.2021.
 *
 * @author Mihail Gerashchenko
 */
public class View {

    public static final String INPUT_NUMBER = "Input your number :";
    public static final String CONGRADULATION = "CONGRADULATIONS!!! ";
    public static final String LOWER = " is lower than required, try again";
    public static final String HIGHER = " is higher than required, try again";
    public static final String GENERATED_NUMBER = "Your number correct. Computer generated ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }
}
