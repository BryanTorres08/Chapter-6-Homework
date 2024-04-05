/*
 *
 * Class: ArrayFive
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will determine if the centennial is present.
 *
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class ArrayFive {
    public static void main(String[] args) {

        ArrayList<LocalDate> centennials = new ArrayList<>();

        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        boolean centennialPresent = false;
        for (LocalDate date : centennials) {
            if (date.getYear() == 1876) {
                centennialPresent = true;
                break;
            }
        }

        System.out.println("Centennial present = " + centennialPresent);
    }
}
