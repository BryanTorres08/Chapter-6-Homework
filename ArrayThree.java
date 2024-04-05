/*
 *
 * Class:ArrayThree
 * @Author: Bryan Torres
 * @Version: 1.0
 * Course: ITEC2140 13 Spring 2024
 * Description: This program will print ArrayList and size
 *
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ArrayThree {

    public static void main(String[] args) {
        String st[];
        int i=0;
        int loc=0,k=0;
        ArrayList<LocalDate> centennials=new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        System.out.println("Before Removal : ");
        DateTimeFormatter d=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        k=centennials.size();
        for(i=0;i<k;i++) {
            String s=d.format(centennials.get(i));
            System.out.println(s);
            st=s.split("/");
            if(st[2].equals("1900")) {
                loc=i;
            }
        }
        System.out.println("size :" +k);
        centennials.remove(loc);
        k=centennials.size();
        System.out.println("After Removal : ");
        for(i=0;i<k;i++) {
            String s=d.format(centennials.get(i));
            System.out.println(s);
        }
        System.out.println("size :" +k);
    }
}
