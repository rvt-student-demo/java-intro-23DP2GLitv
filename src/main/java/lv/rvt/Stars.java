package lv.rvt;

import java.util.*;

public class Stars {
    public static void printStars(int number) {
        int a = 0;
        while (a < number) {
            System.out.print("*");
            a = a + 1;
            if (a == number) {
                break;
            }
        }
        System.out.println("");
        
    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int aug = 0;
        while (aug < height) {
            printStars(width);
            aug++;
        }
    }

    public static void printTriangle(int size) {
        for (int trij = 1; trij < size + 1; trij++) {
            printStars(trij);
        }
    }
}
