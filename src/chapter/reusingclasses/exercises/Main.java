/**
 * 
 */
package chapter.reusingclasses.exercises;

import static net.mindview.util.Print.print;

/**
 * @author AppTeam
 *
 */
class Instrument {
    public void play() {
        print("Instrument is playing");
    }

    static void tune(Instrument i) {
        i.play();
    }
}

class Wind extends Instrument {

}

public class Main {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument trumpet = new Wind();
        Instrument.tune(flute);
        Instrument.tune(trumpet);

        Instrument s = new Wind();
        Wind wind = (Wind) s;
    }
}