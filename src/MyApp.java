import java.util.Locale;

public class MyApp {
    static int countResult;
    static String parameterKey = "JavaAcademy";
    static String arg;

    public static void main(String[] args) {

        if (args.length != 0) {
            arg = args[0];

            if (arg.equals(parameterKey) == true) {

                arg = args[0].toLowerCase(Locale.ROOT);

                for (int i = 0; i < arg.length(); i++) {
                    if (arg.charAt(i) == 'j' || arg.charAt(i) == 'v' || arg.charAt(i) == 'c' || arg.charAt(i) == 'd') {

                        countResult += 1;
                    } else if (arg.charAt(i) == 'm' || arg.charAt(i) == 'y' || arg.charAt(i) == 'p') {
                        countResult += 2;
                    } else if (arg.charAt(i) == 'a') {
                        countResult += 5;
                    }

                }

                System.out.println("Count letters " + countResult);
            } else
            {
                System.out.println("Incorrect parameter");
            }

        }
else
        {
            System.out.println("Run aplication with parameter");

        }
    }

}