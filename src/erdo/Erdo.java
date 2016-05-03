package erdo;

import erdo.Fa.Fa;
import erdo.Fa.tolgy.Makk;
import erdo.Fa.tolgy.Tolgy;

/**
 * Created by doki on 2016.05.03..
 */
public class Erdo {


    public static void main(String args[]) {

        System.out.println("Erdő erdő erdőőő!");


        Fa[] fak = new Fa[10];


        for(int i = 0; i<fak.length; i++) {
            Tolgy ujFa = new Tolgy();

            Makk ujMakk = ujFa.makkTermes();

            fak[i] = ujFa;
        }

        System.out.println("Makkot termelünk!");

    }


}
