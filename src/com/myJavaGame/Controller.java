/*
 * @(#) com.myJavaGame 8.0 21/08/26
 *
 * Copyright (c) 2021 Mihail Gerashchenko.
 * Kiev, Ukraine.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Mihail
 * Gerashchenko ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with Mihail Gerashchenko.
 */

package com.myJavaGame;

import java.util.Scanner;

/**
 * My game aimed at those who need to have fun. Such game calm you down so you will keen it on.
 *
 * @author Mihail Gerashchenko
 * @version 8.0 26 August 2021
 */
public class Controller {

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setValue1(inputIntValueWithScanner(sc));
        view.printMessageAndInt(View.GENERATED_NUMBER, model.getValue1());
    }

    public int inputIntValueWithScanner(Scanner sc) {
        int number;
        int randNumber = Controller.rand(MIN_VALUE, MAX_VALUE);

        view.printMessage(View.INPUT_NUMBER);
        for (; !((number = sc.nextInt()) == randNumber); ) {
            if (number < randNumber) {
                view.printMessage(number + view.LOWER);
            } else if (number > randNumber) {
                view.printMessage(number + view.HIGHER);
            }
        }
        view.printMessage(View.CONGRADULATION);
        return randNumber;
    }

    public static int rand(int min, int max) {
        int number = 1;
        for (int i = min; i <= max; i++) {
            number = (int) (Math.random() * max);
        }
        return number;
    }
}