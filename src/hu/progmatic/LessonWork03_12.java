package hu.progmatic;

import java.util.Scanner;

public class LessonWork03_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Kérném az évet!");
        int ev = scanner.nextInt();

        if (ev % 100 == 0 ){
            if (ev % 400 == 0){
                System.out.println("Szökőév");

            }else {
                System.out.println("Nem Szököév");
            }


        }else if (ev > 1582 && ev % 4 == 0 ){
            System.out.println("Szökőév");

        }else {
            System.out.println("Nem szököév");
        }


        //2.Feladat

      /*  System.out.println("Kérem a számot!");

        int szam = scanner.nextInt();

        int szamlalo = 0;

        for (int i = 1 ; i < (szam + 1 ); i++){


            if (szam % i == 0){

                szamlalo++;

            }


        }
        System.out.print("Az osztók száma: " + szamlalo +  " (Mert az osztó számok: ");

        for (int i = 1 ; i < (szam + 1 ); i++){

            if (szam % i == 0) {

                System.out.print(i + ", ");
            }


        }
        System.out.print(")");*/

        // 3. Feladat

      /*  System.out.println("Kérem a számot!");

        int szam = scanner.nextInt();

        int szamlalo = 0;

        for (int i = 1; i < (szam + 1); i++) {


            if (szam % i == 0) {

                szamlalo++;
            }


        }

        if (szamlalo == 2){
            System.out.println("Prímszám");
        }else{

            System.out.println("Nem prímszám");
        }*/


       /* System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérek még egy számot!");
        int szam2 = scanner.nextInt();

        int lnko = 0;

        for (int i = 1; i < (szam1 + 1); i++) {


            if (szam1 % i == 0 && szam2 % i ==0) {

                lnko = i;


            }

        }

        System.out.println("Legnagyobb közös osztó: " + lnko); */


    }

}