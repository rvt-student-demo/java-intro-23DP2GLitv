package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Mēs gribam uzzinat no lietotaja vardu, uzvardu un gruppu
        System.out.println("Ievadi savu vārdu: ");
        String name = scanner.nextLine();
        System.out.println("Ievadi savu uzvārdu: ");
        String second_name = scanner.nextLine();
        System.out.println("Ievadi savu gruppu: ");
        String group = scanner.nextLine();
        // Un beigās printēt visu kopā vienā rindiņā izmantojot String savienošanu
        System.out.println(name + " " + second_name + " " + group);
    }
}
