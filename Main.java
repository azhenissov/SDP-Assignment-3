public class Main {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();

        ap.play("mp3", "lose_yourself.mp3");
        ap.play("mp4", "algabas.mp4");
        ap.play("wav", "skyfall.wav");
        ap.play("avi", "lose_yourself.avi");
    }
}
