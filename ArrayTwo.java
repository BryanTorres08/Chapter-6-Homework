/*
 *
 * Class: ArrayTwo
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will print ArrayList containing 24810
 *
 */

import java.util.ArrayList;

public class ArrayTwo {
    public static void main(String[] args) {

        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        ArrayList<Integer> intersection = findIntersection(list1, list2);

        System.out.println("Intersection:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> findIntersection(int[] list1, int[] list2) {

        ArrayList<Integer> intersection = new ArrayList<>();


        ArrayList<Integer> list1ArrayList = new ArrayList<>();
        for (int num : list1) {
            list1ArrayList.add(num);
        }


        for (int num : list2) {

            if (list1ArrayList.contains(num) && !intersection.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }
}
