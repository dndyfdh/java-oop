package exception.app.utils;

import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {

        Scanner inputName = new Scanner(System.in);
        System.out.println("input nama:");
        String name = inputName.nextLine();

        Scanner inputUmur = new Scanner(System.in);
        System.out.println("input nama:");
        Integer umur = inputUmur.nextInt();

        System.out.println("=========== OUTPUT =========");
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + umur);

    }
}
