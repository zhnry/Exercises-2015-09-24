/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author hzhen
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard;
        int grade;
        int count = 0;
        float total = 0;

        keyboard = new Scanner(System.in);

        // infinite loop
        for (;;) {
            System.out.print("Enter a grade: ");
            grade = keyboard.nextInt();
            count++;
            if (grade == -1) {
                break;
            }
            total += grade;

        }

        System.out.println("count: " + count);
        System.out.println("grade: " + grade);
        System.out.println("total: " + grade / count);

    }
}
