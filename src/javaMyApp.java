public class javaMyApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("\nLista parametrow:\n");
            for (int i = 0; i < args.length; i++) {
                System.out.println("\t" + args[i]);
            }
        } else {
            System.out.print("Brak parametrow!");
        }
    }
}
