public class MyApp {
    int a;


    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("\n Add result :");
            for (int i = 0; i < args.length; i++) {
                System.out.print('*');
                System.out.println( args[i]);
            }
        } else {
            System.out.print("Brak parametrow!");
        }
    }
}
