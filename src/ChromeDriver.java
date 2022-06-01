public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarke za pomcą chroma");
    }

    @Override
    public void FindeEleenteBy() {
        System.out.println("Znadujemy eleemen za pomocą chroma");
    }

    public static void main(String[] args) {

     ChromeDriver testChrom = new ChromeDriver();
     testChrom.get();
     testChrom.FindeEleenteBy();

    }
}
