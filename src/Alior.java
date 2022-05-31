import javafx.scene.effect.Blend;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;

public class Alior {

    //nrUmowy = BLP0044494255; Suszarka
    //53249000050000595409502692


    public String nrRachunkuSuszarka = "53249000050000595409502692";
    public String nrUmowySuszarka = "BLP0044494255";
    public String nrRachunkuZmywarka = "78249000050000595408230669";
    public String nrUmowyZmywarka = "BLP0038719036";
    public String tempNrRachunku;
    public String temNrUmowy;
    public int lastCountNumber = 12;
    public int Lenght;



    public void zmywarka() {
        System.out.print("Haslo do Zmywarka na dole ");
        odszyfruj(nrRachunkuZmywarka , nrUmowyZmywarka);

    }

    public void suszarka() {
        System.out.print("Haslo do Suszarka na dole ");
        odszyfruj(nrRachunkuSuszarka, nrUmowySuszarka);

    }




    /// metoda obliczajaca ostatnie cyfry rachunku
    public void odszyfruj(String tempNrRachunku , String temNrUmowy) {
        this.temNrUmowy = temNrUmowy;
        this.tempNrRachunku = tempNrRachunku;
        Lenght = nrRachunkuSuszarka.length();
        System.out.println(temNrUmowy);
        for (int i = 0; i < lastCountNumber; i++) {

             int returnNumber = Lenght - lastCountNumber;
            System.out.print(tempNrRachunku.charAt(returnNumber + i));

        }
        System.out.println();
    }
}
    //
    //
    //   public  String nrUmowy = BLP0044494255;
  //   zmywarka
//






