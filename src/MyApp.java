import java.util.Locale;

public class MyApp {
    static int  resoult;
    static String parameter = "JavaAcademy";
    static String arg;

    public static void main(String[] args) {
      //  arg = args[0].toLowerCase(Locale.ROOT);
            arg=args[0];
  //      System.out.println(jest);
        if (arg.equals(parameter) == true) {
            arg = args[0].toLowerCase(Locale.ROOT);
            //      arg= args[0].toString();
            // arg.charAt(3);
            //arg = args[0];
            for (int i = 0; i < arg.length(); i++) {
                if (arg.charAt(i) == 'j' || arg.charAt(i) == 'v' || arg.charAt(i) == 'c' || arg.charAt(i) == 'd') {

                    resoult += 1;
                } else if (arg.charAt(i) == 'm' || arg.charAt(i) == 'y' || arg.charAt(i) == 'p') {
                    resoult += 2;
                } else if (arg.charAt(i) == 'a') {
                    resoult += 5;
                }

            }

            System.out.println("Count letters " + resoult);
        }
        else {
            System.out.println("Incorrect parameters");
        }
        }
        //      System.out.println(arg.length());

        //   for (int i = 0; i < arg.length(); i++) {

        //    System.out.println(args);

        // if ( arg.indent(i) = 'J" ';

        //    wynik = args.equals(java);

        //    System.out.println(wynik);


        //  }
    }

