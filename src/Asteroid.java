import GLOOP.*;
public class Asteroid {
    public double pX, pY;
    private GLKugel kugel;
    private Ufo dasUfo;

    public Asteroid(Ufo pUfo, double pX, double pY) {
        kugel = new GLKugel(pX, 1000, 0, 50, "src/img/Krater.jpg");
        dasUfo = pUfo;
    }

    public void bewegeDich(double speed) {
        kugel.verschiebe(0, -1 * speed, 0);
    }

    public void tp(double pX, double pY, double pZ) {
        kugel.setzePosition(pX, pY, pZ);
    }

    public double gibX() {
        return kugel.gibX();
    }

    public double gibY() {
        return kugel.gibY();
    }

    public double gibZ() {
        return kugel.gibZ();
    }

    public boolean hit() {
        double distance = Math.sqrt(Math.pow(kugel.gibX() - dasUfo.gibX(), 2) + Math.pow(kugel.gibY() - dasUfo.gibY(), 2) + Math.pow(kugel.gibZ() - dasUfo.gibZ(), 2));

        if (distance < 62.5) return true;
        else return false;


    }


    }






