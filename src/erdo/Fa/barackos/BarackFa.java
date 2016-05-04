package erdo.Fa.barackos;

import erdo.Fa.Fa;

/**
 * Created by doki on 2016.05.04..
 */
public class BarackFa extends Fa {

    @Override
    public boolean isGyumolcs() {
        return true;
    }

    public Boroc megraz() {
        //potty
        return new Boroc();
    }

}
