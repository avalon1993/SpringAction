package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "sgt";
    private String artist = "the beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
