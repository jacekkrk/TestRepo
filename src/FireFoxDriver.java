public class FireFoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarke za pomcą FireFoxa");
    }

    @Override
    public void FindeEleenteBy() {
        System.out.println("Znadujemy eleemen za pomocą FireFoxa");
    }

    public static void main(String[] args) {

     FireFoxDriver testFireFox = new FireFoxDriver();
     testFireFox.get();
     testFireFox.FindeEleenteBy();

    }
}
