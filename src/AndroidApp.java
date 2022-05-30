public class AndroidApp extends App {

    public int time;

    public AndroidApp(String test) {
        super(test);
    }

    public void  RunAndroidApp () {

    System.out.println("Uruchamiamy aplikacje na androidzie");
}
public void  setTime(int time){

    this.time = time;
    System.out.println("Jest godzina  " + time);

}

}
