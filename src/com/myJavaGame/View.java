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
public class View {

    public static final String INPUT_NUMBER = "Hello my friend, lets play fascinating game :) Input your number :";
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
