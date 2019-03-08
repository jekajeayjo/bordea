/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.ArrayList;
import java.util.Random;
import static pkg3.BasicFunctions.FastPowFunc;

/**
 *
 * @author User
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] mas = new int[4][];
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new int[rnd.nextInt(5) + 1];
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

    }
}
