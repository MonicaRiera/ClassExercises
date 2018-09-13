package tech.bts.exercises.classes.radio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Radio {

    // Fields
    private int volume;
    private int maxVolume;
    private boolean turnedOn;
    private double frequency;
    private List<Double> channels;

    // Constructor
    public Radio (){
        this.volume = 0;
        this.maxVolume = 100;
        this.turnedOn = false;
        this.frequency = 100.0;
        this.channels = Arrays.asList(100.0,107.1,105.4,99.7,94.9,95.3,106.4,100.7,92.3,103.1);

    }

    // Methods
    public String toString () {
        String result;

        if (this.turnedOn){
            result = "Radio is playing frequency " + this.frequency + " at volume: " + this.volume;
        } else {
            result = "Radio OFF.";

        }

        return result;
    }

    public void turnVolumeUp (int amount) {
        this.volume += amount;

        if (!this.turnedOn) {
            this.volume = 0;
            System.out.println("Volume " + this.volume + ". Can't turn volume up because the radio is OFF");
        } else if (this.volume > this.maxVolume) {
            this.volume = this.maxVolume;

        }

    }

    public void turnVolumeDown (int amount) {
        this.volume -= amount;

        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    /*public void turnOn () {
        this.turnedOn = true;
    }

    public void turnOff () {
        this.turnedOn = false;
        this.volume = 0;
    }*/

    public void switchOnOff () {
        if (this.turnedOn) {
            this.turnedOn = false;
        } else {
            this.turnedOn = true;
            System.out.println("Your radio is on! Current volume: " + this.volume);
        }

    }

    public void playChanel (int index) {

        if (this.turnedOn){
            this.frequency = this.channels.get(index-1);
        } else {
            System.out.println("Radio OFF. Can't play any channel. Please turn ON.");
        }

    }

    public void setChannelFrequency (int index, double frequency) {
        this.channels.set(index-1, frequency);
    }




}
