import GLOOP.*;
public class Asteroid{
    public double pX,pY;
    private GLKugel kugel;
    private Ufo dasUfo;

    public Asteroid(Ufo pUfo, double pX, double pY){
        kugel = new GLKugel(pX,1000,0, 50, "src/img/Krater.jpg");
        dasUfo = pUfo;
    }

    public void bewegeDich(double speed){
        kugel.verschiebe(0,-1 * speed,0);
    }
    public void tp(double pX, double pY, double pZ){
        kugel.setzePosition(pX,pY,pZ);
    }
    public double gibX(){
        return kugel.gibX();
    }
    public double gibY(){
        return kugel.gibY();
    }
    public double gibZ(){
        return kugel.gibZ();
    }


}



