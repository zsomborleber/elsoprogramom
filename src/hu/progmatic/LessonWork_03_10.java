package hu.progmatic;

import java.util.Scanner;

public class LessonWork_03_10 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        //1.Feladat

       /* double[] homersekletek = {12.0, 10.0, 5.0, 2.5, -5.7, -3.2, 0.0, 1.0, 1.5};

        System.out.println("Kérem az első napot");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("kérem a kirándulás hosszát napokban");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsoHomerseklet = homersekletek[elso -1];
        double utolsoHomerseklet = homersekletek[elso -1 + (hossz -1)];
        double valtozas = utolsoHomerseklet - elsoHomerseklet;



        System.out.println("Az első napon mért hőmérséklet: " + homersekletek[elso -1]);
        System.out.println("Az utolsó napon mért hőmérséklet" + homersekletek[elso -1 + (hossz -1)]);
        System.out.println("  A hőmérséklet változása:" + valtozas);

        if (hossz > 1){
            System.out.println(" A jőmérséklet átlagos változása: " + valtozas / (hossz-1));
            }
            */

// 2. Feladat
      /*  double[] homersekletek = {12.0, 10.0, 5.0, 2.5, -5.7, -3.2, 0.0, 1.0, 1.5};

        System.out.println("kérem az első 1. hőmérsékletét.");
        homersekletek[0] = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Kérema  második 2. hőmérsékletét.");
        homersekletek[1] = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Kérem a harmadik 3. hőmérsékletét.");
        homersekletek[2] = scanner.nextDouble();

        System.out.println("Kérem az első napot");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("kérem a kirándulás hosszát napokban");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsoHomerseklet = homersekletek[elso -1];
        double utolsoHomerseklet = homersekletek[elso -1 + (hossz -1)];
        double valtozas = utolsoHomerseklet - elsoHomerseklet;



        System.out.println("Az első napon mért hőmérséklet: " + homersekletek[elso -1]);
        System.out.println("Az utolsó napon mért hőmérséklet" + homersekletek[elso -1 + (hossz -1)]);
        System.out.println("  A hőmérséklet változása:" + valtozas);*/

        //3.Feladat

      // double[] homersekletek = {12.0, 10.0, 5.0, 2.5, -5.7, -3.2, 0.0, 1.0, 1.5};
// i =0
       /* int i = 0;
        System.out.println("kérem az" + ( i+ 1) + ". nap hőmérsékletét.");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        i++;

        // i = 1
        System.out.println("kérem az" + ( i+ 1) + ". nap hőmérsékletét.");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        i++;
// i = 2

        System.out.println("kérem az" + ( i+ 1) + ". nap hőmérsékletét.");
        homersekletek[i] = scanner.nextDouble();
        scanner.nextLine();

        i++;

        System.out.println("Kérem az első napot");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("kérem a kirándulás hosszát napokban");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsoHomerseklet = homersekletek[elso -1];
        double utolsoHomerseklet = homersekletek[elso -1 + (hossz -1)];
        double valtozas = utolsoHomerseklet - elsoHomerseklet;



        System.out.println("Az első napon mért hőmérséklet: " + homersekletek[elso -1]);
        System.out.println("Az utolsó napon mért hőmérséklet" + homersekletek[elso -1 + (hossz -1)]);
        System.out.println("  A hőmérséklet változása:" + valtozas); */

        // FOR CIKLUS!!
        //  i = 0, i = 1, i =2
     /*   for (int i = 0; i <3; i++) {
            System.out.println("kérem az" + ( i+ 1) + ". nap hőmérsékletét.");
            homersekletek[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("Kérem az első napot");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("kérem a kirándulás hosszát napokban");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsoHomerseklet = homersekletek[elso -1];
        double utolsoHomerseklet = homersekletek[elso -1 + (hossz -1)];
        double valtozas = utolsoHomerseklet - elsoHomerseklet;



        System.out.println("Az első napon mért hőmérséklet: " + homersekletek[elso -1]);
        System.out.println("Az utolsó napon mért hőmérséklet" + homersekletek[elso -1 + (hossz -1)]);
        System.out.println("  A hőmérséklet változása:" + valtozas);*/

        // 6.feladat, az összes bekérése
       /*double[] homersekletek = {12.0, 10.0, 5.0, 2.5, -5.7, -3.2, 0.0, 1.0, 1.5, 1.1};

        for (int i = 0; i < homersekletek.length; i++) {
            System.out.println("kérem az " + (i + 1) + ". nap hőmérsékletét.");
            homersekletek[i] = scanner.nextDouble();
            scanner.nextLine();*/



        // Jégtúrás feladat

        double[] homersekletek = {12.0, 10.0, 5.0, 2.5, -5.7, -3.2, 0.0, 1.0, 1.5, 1.1};

        System.out.println("Kérem az első napot");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("kérem a kirándulás hosszát napokban");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        //elso = 2;
        // hossz = 3;
       // int i = 1;   // elso -1
      /*  homersekletek[i] = 0.0;
        i++;
        homersekletek[i] = 0.0;
        i++;
        homersekletek[i] = 0.0;
        i++;*/

        // első érvénytelen érték, i-nek kisebbnek kell lennie
        // i = 4;  elso + hossz -1

        for (int i = elso -1;i < elso + hossz -1; i++){
            homersekletek[i] = 0.0;
        }
        System.out.println("Vége");



        }


    }
