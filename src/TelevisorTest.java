public class TelevisorTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor("Samsung", "Black", 25);

        tv.ShowStatus();
        tv.turnOn();
        tv.ShowStatus();
        tv.turnOff();
        tv.ShowStatus();

    }
}
