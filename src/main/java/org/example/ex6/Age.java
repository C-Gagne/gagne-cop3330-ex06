/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex6;

import java.util.Scanner;

public class Age {
    public static Integer setAge()
    {
        Scanner newAge = new Scanner(System.in);
        return Integer.parseInt(newAge.nextLine());
    }
}
