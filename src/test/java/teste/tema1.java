package teste;

import sun.security.x509.OtherName;

public class tema1 {
    //afla cate numere de 4 cifre au restul impartirii la 5 egal cu 4
    public static void main(String args[]) {
        int i;
        int contor = 0;
        for (i = 1000; i <= 9999; i++)
            if (i % 5 == 4) contor++;
        System.out.println("Sunt" + contor + "numere");
        // suma primelor 2 numere este mai mare decat al treilea
        int x = 7;
        int y = 9;
        int z = 10;
        if (x + y > z) {
            System.out.println("Suma numerelor este mai mare decat:" + z);
        } else {
            System.out.println("Suma este mai mica decat:" + z);
        }
        //Afiseaza de 5 ori cuvantul DA pe un rand cu spatiu intre
        //System.out.println("DA DA DA DA DA");
        String da = "DA ";
        int k=5;
        for(int j=1;j<=k;j++){
         System.out.print(" "+da);}
    }
}











