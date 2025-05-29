package oop1;

import java.sql.SQLData;

// 절차지향 프로그래밍
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //음악 플레이어 켜기
        on(data);
        up(data);
        up(data);
        down(data);
        state(data);
        off(data);
    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void up(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨 :" + data.volume);
    }

    static void down(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨 :" + data.volume);
    }

    static void state(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
    }

    // 절차 지향 프로그래밍의 한계
    // ->  데이터와 기능이 각각 분리 되어 있음
}
