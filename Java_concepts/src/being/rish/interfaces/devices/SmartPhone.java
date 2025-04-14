package being.rish.interfaces.devices;

public class SmartPhone implements Phone, Camera, MusicPlayer {

    @Override
    public void clickPhoto() {
        System.out.println("Clicking photo with smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video with smartphone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music with smartphone");
    }

    @Override
    public void call() {
        System.out.println("Calling with smartphone");
    }
}
