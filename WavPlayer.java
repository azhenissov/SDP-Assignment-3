// Concrete Adaptee 1
public class WavPlayer implements AdvancedMediaPlayer {
    @Override
    public void playWav(String fileName) {
        System.out.println("Playing wav file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // WAV player doesn't support MP4
    }
}
