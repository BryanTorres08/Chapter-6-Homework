/*
 *
 * Class: Dice
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will print 10 dices output between value of 1 through 6.
 *
 */

import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        int[] dice1 = new int[10];

        Random random = new Random();
        for (int i = 0; i < dice1.length; i++) {

            dice1[i] = random.nextInt(6) + 1;
        }

        System.out.println("Array Contents:");
        for (int roll : dice1) {
            System.out.print(roll + " ");
        }
    }
}
