import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

public class SoundManager {

    public static void playSound(String filename) {
        try {
            URL soundURL = SoundManager.class.getResource("/sounds/" + filename);
            if (soundURL == null) {
                System.err.println("Sound file not found: " + filename);
                return;
            }

            // Load audio clip
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();  // Play the sound

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
