package oop1;

public class MusicPlayer {
    int volume = 0; // 멤버 변수
    boolean isOn = false; // 멤버변수

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

     void off() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void volumeup() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void volumedown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    void playerstatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 :" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
