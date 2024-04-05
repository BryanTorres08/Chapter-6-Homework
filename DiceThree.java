/*
 *
 * Class: DiceThree
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will print 10 dices output between values of 1 through 6.
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class DiceThree {
    public static void main(String[] args) {

        ArrayList<Integer> dice3 = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            int roll = rand.nextInt(6) + 1;

            dice3.add(roll);
        }

        System.out.print("dice3 = ");
        for (int roll : dice3) {
            System.out.print(roll + " ");
        }
    }
}
