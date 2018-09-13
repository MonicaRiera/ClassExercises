package tech.bts.exercises.classes.radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.switchOnOff();

        radio.turnVolumeUp(500);
        System.out.println(radio);
        radio.turnVolumeDown(50);
        radio.playChanel(3);
        System.out.println(radio);
        radio.setChannelFrequency(3, 107.5);
        radio.playChanel(3);
        System.out.println(radio);

        radio.switchOnOff();
        System.out.println(radio);

        radio.turnVolumeUp(10);
        radio.playChanel(5);

        radio.switchOnOff();
        System.out.println(radio);

        radio.turnVolumeUp(10);
        radio.playChanel(5);
        System.out.println(radio);



    }
}
