public class Televisor {
    String producent;
    String kolor;
    boolean isTurnOn = false;
    double przekatna;

    public Televisor(String producent, String kolor, double przekatna) {
        this.producent = producent;
        this.kolor = kolor;
        this.przekatna = przekatna;
    }

    void turnOn(){
        isTurnOn = true;
    }
    void turnOff(){
        isTurnOn = false;
    }

    void ShowStatus(){
        System.out.println(isTurnOn);
    }
}
