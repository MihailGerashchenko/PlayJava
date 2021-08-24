package playJava;

import java.util.Scanner;

public class Controller {

    /**
     * Created by User on 24.08.2021.
     *
     * @author Mihail Gerashchenko
     */

    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        int number;
        int randNumber = Controller.rand(model.MIN_VALUE, model.MAX_VALUE);

        do {
            view.printMessage(View.INPUT_NUMBER);
            number = sc.nextInt();
            model.setValue1(number);

            if (number == randNumber) {
                view.printMessage(View.CONGRADULATION);
                view.printMessageAndInt(View.GENERATED_NUMBER, model.getValue1());
            } else if (number < randNumber) {
                view.printMessage(number + view.LOWER);
            } else if (number > randNumber) {
                view.printMessage(number + view.HIGHER);
            }
        } while (number != randNumber);
    }

    public static int rand(int min, int max) {
        int number = 1;
        for (int i = min; i <= max; i++) {
            number = (int) (Math.random() * max);
        }
        return number;
    }
}