/*
 *
 * Class: ArrayFour
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will determine the ArrayList size.
 *
 */

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public class ArrayFour {
    public static void main(String[] args) {

        ArrayList<LocalDate> centennials = new ArrayList<>();


        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));


        int size = centennials.size();


        System.out.println("size = " + size);
    }
}
