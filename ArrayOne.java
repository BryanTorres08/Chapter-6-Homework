/*
 *
 * Class: ArrayOne
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will print 5 dices output between 1 and 6.
 *
 */

import java.util.ArrayList;
import java.util.Random;

public class ArrayOne {
    public static void main(String[] args) {

        ArrayList<Integer> dice4 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int roll = random.nextInt(6) + 1;
            dice4.add(roll);
        }

        System.out.print("dice4 = ");
        for (Integer roll : dice4) {
            System.out.print(roll + " ");
        }
    }
}
