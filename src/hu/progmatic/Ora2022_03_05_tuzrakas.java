package hu.progmatic;

import java.util.Scanner;

public class Ora2022_03_05_tuzrakas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1 perc egeshez 10egyseg fa kell
        int perc = 0;
        System.out.println("Mennyi tüzifád van?");
        int tuzifa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Száraz az idő? ( i , n )");
        boolean szaraz = scanner.nextLine().equalsIgnoreCase("i");

        boolean voltE = tuzifa <10 || !szaraz;
        if(voltE){
            System.out.println("Nem volt grillezés :( ");
        }

// többször fut le nem csak 1x a while

        while (tuzifa >= 10 && szaraz) {
            System.out.println("A tűz ég");
           // perc += 1;
            perc ++;
            tuzifa = tuzifa -10;

        }
        System.out.println(" A tűz elaludt");
        System.out.println(" eltelt percek száma: " + perc);
        System.out.println(" A maradék tüzifa: " + tuzifa);




    }
}
