public class TelevisorMode {
    void turnOn(Televisor tv){
        tv.isTurnOn = true;
    }
    void turnOff(Televisor tv){
        tv.isTurnOn = false;
    }

    void ShowStatus(Televisor tv){
        System.out.println(tv.isTurnOn);
    }
}
