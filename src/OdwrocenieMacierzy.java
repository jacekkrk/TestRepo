public class OdwrocenieMacierzy {
    public static void main(String[] args) {

        int [] maciorka = new int [] {1 , 3 , 6 , 9 , 2 , 12 ,5 , 55 ,9 };
        int [] reversMaciorka = new int [maciorka.length];
        int draw; // xyz;
        for (int k = 0 ; k < maciorka.length ; k++){
            draw  = maciorka[k];
         //   xyz = maciorka.length -1
            reversMaciorka[  maciorka.length -1 - k  ] = draw;
        }

         for (int i = 0 ; i < maciorka.length ; i++ ) {
            System.out.print(maciorka[i] + " ");
        }
        System.out.println();

        for (int i = 0 ; i < maciorka.length ; i++ ) {
            System.out.print(reversMaciorka[i] + " ");
        }




}


    }



