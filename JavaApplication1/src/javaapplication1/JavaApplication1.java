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
      Scanner in = new Scanner(System.in);
      int g1 = 0;
      int g2 = 0;
  

      System.out.print("Enter your first grade:");
      g1 = in.nextInt();
      
      System.out.print("Enter your second grade: ");
      g2 = in.nextInt();
      
      System.out.print((g1+g2)/2);
    }
    
}
