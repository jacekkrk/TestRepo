import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaStartTablice {

    private static int lImion =5;

   String[] imiona =  new String[lImion];
   String tempImie;



    public JavaStartTablice() {

        Scanner scanner = new Scanner(System.in);
        Scanner wpiszImie = new Scanner(System.in);

        for (int i = 0; i < lImion; i++) {
            tempImie = wpiszImie.nextLine();

            imiona[i] = tempImie;

        }
        for (int k = 0; k < lImion; k++) {

            System.out.println("Cześć nazywam sie " + imiona[k]);
        }
    }


}
