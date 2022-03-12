package hu.progmatic;

import java.util.Scanner;

public class ora220310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Hány nap adatát szeretnéd tárolni?");

        int napokSzama = scanner.nextInt();
        scanner.nextLine();

        int[] homersekletek = new int[napokSzama];

        for (int i = 0; i < homersekletek.length; i++){
            System.out.println("Kérem a " + (i+1) + ". nap értékét");
            homersekletek[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Vége");*/
//2. feladat

        System.out.println("Kérem a hőmérsékleteket!");
        String bemenet = scanner.nextLine();
        String[] adatok = bemenet.split(" ");
        int [] homersekletek = new int[adatok.length];

        for (int i = 0 ; i < homersekletek.length; i++) {
            homersekletek[i] = Integer.parseInt(adatok[i]);
        }

        System.out.println("Vége");

        // 3. feladat
        int szamlalo = 0;
        for ( int i = 0; i < homersekletek.length; i++) {
            if (homersekletek[i] < 0){
                szamlalo++;

            }
            System.out.println("Fagyos számok száma: " + szamlalo);
        }





    }
}
