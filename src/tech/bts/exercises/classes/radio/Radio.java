package tech.bts.exercises.classes.radio;
import java.util.*;

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
        String status = this.turnedOn ? "ON" : "OFF";
        return "Radio " + status + ", playing frequency " + this.frequency + " at volume: " + this.volume;
    }

    public void turnVolumeUp (int amount) {
        if (this.turnedOn) {
            this.volume += amount;

            if (this.volume > this.maxVolume) {
                this.volume = this.maxVolume;
            }
        }
    }

    public void turnVolumeDown (int amount) {
        if (this.turnedOn){
            this.volume -= amount;

            if (this.volume < 0) {
                this.volume = 0;
            }
        }
    }

    public void switchOnOff () {
        this.turnedOn = !this.turnedOn;
    }

    public void playChanel (int index) {
        if (this.turnedOn){
            this.frequency = this.channels.get(index-1);
        }
    }

    public void setChannelFrequency (int index, double frequency) {
        this.channels.set(index-1, frequency);
    }




}
