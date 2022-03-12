import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class LessonWork_2022_03_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       /* System.out.println("Mi Magyarország fővárosa?");
        String valasz = scanner.nextLine();

        if(!valasz.equalsIgnoreCase("Budapest")) {
            System.out.println("veled nem vagyokk hajlandó játszani!");
            return;

        }

        System.out.println("Mi Ausztria fővárosa?");
        valasz = scanner.nextLine();
        if (valasz.equalsIgnoreCase("Bécs")) {
            System.out.println("Ügyes vagy!");

        }else {
            System.out.println("Béna vagy!"); */


        // Összefűzés

     /*   System.out.println("Kérnék egy szót!");
        String szo = scanner.nextLine();
        System.out.println("Kérnék még egy szót!");
        String szo1 = scanner.nextLine();
        System.out.println("Kérnék még 1 szót");
        String szo2 = scanner.nextLine();

        System.out.println(" A 3 szó összefűzése: " + szo + " " + szo1 + " " + szo2);*/


       /* System.out.println("Kérem a szöveg hosszát!");
        int hossz = scanner.nextInt();
        scanner.nextLine();
        String szoveg = "";

        while (szoveg.length() < hossz) {
            System.out.println("Kérem a következő darabot!");
            String darab = scanner.nextLine();
            szoveg += darab;
        }

        System.out.println(" A Megadott szoveg: " + szoveg);*/
//2.feladat!

       /* String szoveg  = "";
        String darab;
        // Ha a blokkon belül hozzuk létre a változót. akkor már nem fog létezni a while feltételnék
        // mivel a blokkból kilépve megsemmisülnek az adott blokkban létrehozott változók.


        do {
            System.out.println("Kérem a következő darabot!");
            darab = scanner.nextLine();
            szoveg += darab;
        } while (darab.length() > 0);

        System.out.println("A megadott szöveg: " + szoveg);*/

        // 3. feladat!!

      /*  System.out.println(" Mikor adjunk el?");

        int stoploss = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();
        int nap = 0;


        while (arfolyam > stoploss) {
            System.out.println(" Kérem a napi változást");
            int valtozas = scanner.nextInt();
            scanner.nextLine();
            arfolyam += valtozas;
            nap++;
        }

        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println(" Eltelt napok száma: " + nap); */

        // 4.feladat!

       /* System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokSzama = 0;
        int valtozas;

        do {
            System.out.println("kérem a napi változást!");
            valtozas = scanner.nextInt();
            scanner.nextLine();
            arfolyam += valtozas;
            napokSzama++;

        }while (valtozas <=0);

        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println(" Eltelt napok száma: " + napokSzama); */


        // 5.feladat!


     /*   System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokSzama = 0;
        int valtozas;

        do {
            System.out.println("kérem a napi változást!");
            valtozas = scanner.nextInt();
            scanner.nextLine();
            arfolyam += valtozas;
            napokSzama++;

        }while (valtozas >= 0);

        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println(" Eltelt napok száma: " + napokSzama); */

        // 6. feladat!

     /*   String jelszo;


        do {
            System.out.println("Kérem a jelszót! ");
            jelszo = scanner.nextLine();

            if (jelszo.length() < 8){
                System.out.println("A jelszónak legalább 8 karaktert kell tartalmaznia!");

            }
        }while (jelszo.length() < 8);

        System.out.println("Az érvényes jelszó: " + jelszo);*/

        // 7. feladat!

     /*   int iranyitoszam;

        do {
            System.out.println("Kérem az irényítószámot!");
            iranyitoszam = scanner.nextInt();
            scanner.nextLine();

            if (iranyitoszam <1000 || iranyitoszam >9999) {
                System.out.println(" Az irányítószámnak 1000 és 9999 között kell lennie.");
            }

            }while (iranyitoszam  < 1000 || iranyitoszam >9999);
        System.out.println("Az irányítószámod: " + iranyitoszam);*/


        // 8. Feladat

       /* System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        scanner.nextLine();

        int abszolut = szam1 >= 0 ? szam1 : -szam1;
        System.out.println("A szám abszolút értéke: " + abszolut);*/

        // 9. Feladat

      /*  System.out.println("Kérek egy számot");
        int szam = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérek még egy számot!");
        int szam2 = scanner.nextInt();
        scanner.nextLine();

        int kulonbseg = szam - szam2;
        int abszolut = kulonbseg >0 ? kulonbseg : -kulonbseg;
        System.out.println("A két szám különbségének értéke: " + abszolut); */

        // 10.feladat!

      /*  System.out.println("Hogy hívnak?");
        String nev = scanner.nextLine();
        System.out.println(" Milyen nemű vagy?");
        String nem = scanner.nextLine();
        String a = "Úr!";
        String b = "Asszony!";

        boolean nem1 = nem.equalsIgnoreCase("Férfi");

        String megszolitas = nem1 == true ? a : b;

        System.out.println("Tisztelt " + nev + " " + megszolitas ); */




    }
}
