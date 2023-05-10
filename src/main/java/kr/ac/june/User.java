package kr.ac.june;

import java.util.Scanner;

public class User {
    private static boolean isOn;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        do {
            System.out.println("============ 랜덤 캐릭터 뽑기 ===============");
            System.out.println("1. 게임기 켜기");
            System.out.println("2. 뽑기 메뉴 보기");
            System.out.println("3. 게임 꺼지기");
            System.out.println();
            System.out.print("메뉴 선택 : ");
            int input = sc.nextInt();

            switch (input){
                case 1:
                    turnOn();
                    break;
                case 2:
                    g.function();
                    break;
                case 3:
                    turnOff();
                    break;
            }
        }while(true);
    }

    public static void turnOn(){
        if(isOn){
            System.out.println("게임");
        } else {
            System.out.println("게임기가 켜졌습니다");
            isOn = true;
        }
    }
    public static void turnOff(){
        if(isOn){
            isOn = false;
            System.out.println("게임기를 종료합니다");
        } else {
            System.out.println("이미 꺼져있습니다");
        }
    }
}
