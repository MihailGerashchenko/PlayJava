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

/**
 * My game aimed at those who need to have fun. Such game calm you down so you will keen it on.
 *
 * @author Mihail Gerashchenko
 * @version 8.0 26 August 2021
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();

    }
}