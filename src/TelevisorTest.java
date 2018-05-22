public class TelevisorTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor("Samsung", "Black", 25);
        TelevisorMode tvMode = new TelevisorMode();

        tvMode.ShowStatus(tv);
        tvMode.turnOn(tv);
        tvMode.ShowStatus(tv);
        tvMode.turnOff(tv);
        tvMode.ShowStatus(tv);

    }
}
