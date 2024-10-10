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

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i = i + 1;
            if (i == number) {
                break;
            }
        }
    }

    public static void printRightTriangle(int size) {
        for (int trij = 1; trij < size + 1; trij++) {
            printSpaces(size - trij);
            printStars(trij);
        }
    }

    public static void chistmasTree(int height) {
        int star = 1;
        for (int tree = 0; tree < height; tree++) {
            printSpaces(height - tree);
            printStars(star);
            star = star + 2;
        }
        printSpaces(height - 1);
        printStars(3);
        printSpaces(height - 1);
        printStars(3);
    }
}
