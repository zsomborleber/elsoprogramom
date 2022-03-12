package hu.progmatic;

import java.util.Scanner;

public class feladat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Mennyi pénzed van?");
        int torzstoke = scanner.nextInt();
        scanner.nextLine();
        int sajattoke = torzstoke;
        int evek = 0;

        if(sajattoke < 3000000) {
            System.out.println("csóró vagy!!");
        }

        while (sajattoke >= 3000000) {
            System.out.println("Mennyi volt a nyereség?");
            String bemenet = scanner.nextLine();
            if(bemenet.equalsIgnoreCase("vége")) {
                int nyereseg = Integer.parseInt(bemenet);
            }

            int nyereseg = scanner.nextInt();

            if( nyereseg != -999999) {
                sajattoke += nyereseg;

                evek++;
                System.out.println(" A saját tőke " + evek + " Év végén: " + sajattoke);

            }else{
                break;
            }


        }

        System.out.println(" A maradek pénzed: " + sajattoke);
         */



        // HÁZI 2.része

       /* int j = 5, i = 10;
        j += j * 2 == i ? j : i % 3;
        System.out.println(j);*/

      /*  int n = 0;
        n -= (n % 2 > 0) ? 1 + 2 * n : n - 3;
        System.out.println(n);*/

     /*   int b = 9;
        boolean a = ++b % 5 == 0 ? b == 10 : b != 9;
        System.out.println(b);*/

       /* boolean b = false, c = true, d = true;
        boolean a = b || c ? ! ( b || c && d ) : c && ! d;
        System.out.println(b);*/

       /* int f = 1;
        boolean e = !false == (10%3 == f);
        int g = e ? f -= (++f * -1) : f+ (f+f) * ++f;
        System.out.println(f);*/

        int v = 5, x = v * --v;
        boolean y = x % v < 0 ? v == 0 : !false;
        boolean z = !y && x == v * v;







    }





}
