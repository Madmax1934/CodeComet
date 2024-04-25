package designpatterns.Adapterpattern;

public class Pilotadapter implements Pen{

    Pilotpen pp = new Pilotpen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
