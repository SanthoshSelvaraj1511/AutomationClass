public class Speaker implements power,Volume,Playpause {
    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void VolumeUp() {
        System.out.println("volumeUp");
    }

    @Override
    public void VolumeDown() {
        System.out.println("volumeDown");
    }

    @Override
    public void mute() {
        System.out.println("mute");
    }

    @Override
    public void powerOn() {
        System.out.println("powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff");
    }
}