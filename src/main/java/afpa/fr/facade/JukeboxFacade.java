package afpa.fr.facade;

public class JukeboxFacade {
    private AudioPlayer audioPlayer;
    private Amplifier amplifier;
    private Speaker speaker;

    public JukeboxFacade() {
        audioPlayer = new AudioPlayer();
        amplifier = new Amplifier();
        speaker = new Speaker();
    }

    /**
     * 
     * @param track
     */
    public void playMusic(String track) {
        amplifier.turnOn();
        amplifier.setVolume(5);
        speaker.connect();
        audioPlayer.load(track);
        audioPlayer.play();
        speaker.outputSound();
    }
}
