/*
 *
 * Class: DiceTwo
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will print 6 dices output between the value of 1 through 6.
 *
 */

import java.util.Random;

public class DiceTwo {
    public static void main(String[] args) {

        int[] dice2 = new int[6];

        Random random = new Random();
        for (int i = 0; i < dice2.length; i++) {

            dice2[i] = random.nextInt(6) + 1;
        }

        System.out.println("Array Contents:");
        for (int i = 0; i < dice2.length; i++) {
            System.out.print(dice2[i] + " ");
        }
    }
}
