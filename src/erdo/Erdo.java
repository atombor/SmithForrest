package erdo;

import erdo.Fa.Fa;
import erdo.Fa.barackos.BarackFa;
import erdo.Fa.tolgy.Makk;
import erdo.Fa.tolgy.Tolgy;

/**
 * Created by doki on 2016.05.03..
 */
public class Erdo {

    public static final int BARACKFAK_SZAMA = 5;

    public static void main(String args[]) {

        System.out.println("Erdő erdő erdőőő!");


        Fa[] fak = new Fa[10];


        for(int i = 0; i<fak.length-BARACKFAK_SZAMA; i++) {
            Tolgy ujFa = new Tolgy();

            Makk ujMakk = ujFa.makkTermes();

            fak[i] = ujFa;
        }

        System.out.println("Makkot termelünk!");

        for(int i = BARACKFAK_SZAMA; i<fak.length; i++) {
            fak[i] = new BarackFa();
        }
        System.out.println("Aztakkor barackos.");

    }


}
