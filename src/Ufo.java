import GLOOP.*;
public class Ufo{

    GLPrismoid ufo;
    public Ufo(){
        ufo = new GLPrismoid
                (0,0,0, 50,50,3,20);
    }

    //UFo nach links
    public void bewegeLinks(){
        ufo.verschiebe(-4,0,0);
    }

    //Ufo nach rechts
    public void bewegeRechts(){
        ufo.verschiebe(4,0,0);
    }

    //Ufo nach rechts
    public void bewegeHoch(){
        ufo.verschiebe(0,4,0);
    }

    // Ufo nach unten
    public void bewegeUnten(){
        ufo.verschiebe(0,-4,0);
    }


   //gibt X Wert von UFO
    public double ufoX(){
        return ufo.gibX();
    }

}
