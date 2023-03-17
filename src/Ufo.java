import GLOOP.*;
public class Ufo{
    public GLTastatur tast;
    private GLWuerfel mark;

    double pX,pY;

    public Ufo() {
        mark = new GLWuerfel(0, 0, 0, 25);
        mark.setzeTextur("src/img/MarkAbi.jpg");
    }
    //Steuerung
    public void bewegeLinks() {
        mark.verschiebe(-0.5,0,0);
        mark.setzeDrehung(0,-5,0);

    }

    public void bewegeRechts() {
        mark.verschiebe(0.5,0,0);
        mark.setzeDrehung(0,5,0);
    }
    public void drehungreset() {

        mark.setzeDrehung(0,0,0);

    }

    public void bewegeHoch() {
        mark.verschiebe(0,0,0.5);
        mark.setzeDrehung(10,0,0);
    }

    public void bewegeRunter() {
        mark.verschiebe(0,0,-0.5);
        mark.setzeDrehung(-10,0,0);
    }

    public void explodiere() {
        double z = Math.random();
        for (int i=0; i<2000; i++){

        }
    }

    public double gibX(){
        return mark.gibX();
    }
    public double gibY(){
        return mark.gibY();
    }
    public double gibZ(){
        return mark.gibZ();
    }
}
