import GLOOP.*;
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
    private Asteroid asteroid1,asteroid2,asteroid3;


    public Ufospiel() {
        kamera = new GLSchwenkkamera(0,-10);
        kamera.setzeBlickpunkt(0, 10, 0);
        kamera.verschiebe(0, 200, 500);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        dasUfo = new Ufo();

        asteroid1 = new Asteroid();



        this.weiter();




    }


    public void weiter(){
        while (0==0) {
            asteroid1.bewegedich();

            if (tastatur.istGedrueckt('w') && (dasUfo.ufoX() < 500)) {
                dasUfo.bewegeHoch();
            }
            if (tastatur.istGedrueckt('d') && (dasUfo.ufoX() < 500)) {
                dasUfo.bewegeRechts();
            }
            if (tastatur.istGedrueckt('a') && (dasUfo.ufoX() > -500)) {
                dasUfo.bewegeLinks();
            }
            if (tastatur.istGedrueckt('s') && (dasUfo.ufoX() < 500)) {
                dasUfo.bewegeUnten();
            }
            Sys.warte(5);
        }
        }




    }






