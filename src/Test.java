// wypisac liczby od 1 do 100 podzielne przez 3

//

public class Test {

    static int dviade = 5;
    static int resoult, narrow;
    static int rangeNumber = 1324;
    static int displayNumberInLinie = 10;
    static int liczbaWierszy = 10;
    static int[] zadanie = {1, 3, 5};


    public static void main(String[] args) {
        for (int i = 0; i <= rangeNumber; i++) {

            resoult = i % dviade;
            if (resoult == 0 && i != 0) {
                System.out.print(i + " ");
                narrow++;
                if (narrow == liczbaWierszy) {
                    narrow = 0;
                    System.out.println();


                }
            }

        }
  /*      OdwrocenieMacierzy ddd = new OdwrocenieMacierzy();
        ddd.testPole = 10; 
        
  int lenght = zadanie.length;
        System.out.println(lenght); */


        AndroidApp NewAndro = new AndroidApp("aaa");
        NewAndro.setTime(15);
        NewAndro.appInfo("Windows NT ");



    }
}







