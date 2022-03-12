package hu.progmatic;

import java.util.Scanner;

public class Leber_Zsombor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Verzió 1.0

      /*  System.out.println("Hány gyufa van az asztalon?");
        int gyufakSzama = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mennyi gyufát szeretnél húzni? 1,2,3?");
        int huzas = scanner.nextInt();
        scanner.nextLine();


        while (huzas <= gyufakSzama) {
            System.out.println("Húzz mégegyszer!");
            int huzas1 = scanner.nextInt();
            scanner.nextLine();

            huzas+= huzas1;
        }
        System.out.println("A jétéknak vége! ");*/


        // Verzió 2.0
      /*  System.out.println("Mennyi gyufával játszotok?");
        int gyufakSzama = scanner.nextInt();
        boolean elsoLep = true;
        System.out.println("Első játékos: ");
        while (gyufakSzama>1){
            System.out.println(" A gyufák száma: " + gyufakSzama);
            System.out.println("Mennyi gyufát húzol? (1,2,3)");
            int huzas = scanner.nextInt();
            gyufakSzama -= huzas;
            elsoLep = !elsoLep;
            if (elsoLep){
                System.out.println("Első játékos húz:");
            }else{
                System.out.println("Második játékos húz:");
            }

        }
        if (elsoLep) {
            System.out.println("Az első játékos vesztett.");
        }else {
            System.out.println("A második játékosz vesztett. ");
        }*/

    }
}
