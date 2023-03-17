import GLOOP.*; 
public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;
    Asteroid[] a1;

    private Ufo dasUfo;


    public Ufospiel() {
        kamera = new GLKamera(1920, 1080);
        kamera.verschiebe(0, -200, -300);
        kamera.setzeBlickpunkt(0,0,150);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        dasUfo = new Ufo();
        a1 = new Asteroid[20];
        for (int q=0; q < a1.length; q++) {
            a1[q] = new Asteroid(dasUfo, 0, 0);
        }

        for (int i=0 ;i < a1.length; i++) {
            a1[i].tp(Math.random() * 1000 - 500, 1000 + Math.random() * 1000);
        }





        steuerung();
    }

    public void steuerung() {
        while (!tastatur.esc()) {
            if (tastatur.links() && dasUfo.gibX() > -475) {
                dasUfo.bewegeLinks();
            }
            else if (tastatur.rechts() && dasUfo.gibX() < 475) {
                dasUfo.bewegeRechts();
            }
          else  if (tastatur.oben() && dasUfo.gibY() < 200) {
                dasUfo.bewegeHoch();
            }
          else  if (tastatur.unten() && dasUfo.gibY() > -200) {
                dasUfo.bewegeRunter();

            }
            else {
                dasUfo.drehungreset();
            }
            for (int i=0 ;i <a1.length; i++){
                a1[i].bewegeDich(2.5);
                if (a1[i].gibY() < -1000) {
                    a1[i].tp(Math.random() * 1000 - 500, 1000 + Math.random() * 1000);
                }
            }
           /*
            if (asteroid2.gibY() < -1000) {
                asteroid2.tp(-330,1200);
            }
            if (asteroid3.gibY() < -1000) {
                asteroid3.tp(430,1350);
            }
            */Sys.warte();
        }
        Sys.beenden();
    }

}