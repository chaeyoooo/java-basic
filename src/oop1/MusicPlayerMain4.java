package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeup();
        player.volumeup();
        player.volumedown();
        player.playerstatus();
        player.off();
    }
}
