package kr.ac.june;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Game {
    private boolean isOn;
    Random random = new Random();
    private int[] list = new int[]{};
    public int money = 10000;
    public void function(){
        do {
            int input;
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("***** 뽑기 메뉴 *****");
            System.out.println();
            System.out.println("1. 게임 켜기");
            System.out.println("2. 뽑기");
            System.out.println("3. 뽑은 캐릭터 목록 보기");
            System.out.println("4. 게임 끄기");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            System.out.println();

            switch (input){
                case 1: turnOn(); break;
                case 2: game(); break;
                case 3: cList(); break;
                case 4: turnOff(); break;
                default:
                    System.out.println("잘못된 입력을 하셨습니다. 다시 입력 해 주세요.");
            }
        }while(true);}
//
    public void turnOn(){
        if (isOn) {
            System.out.println(isOn);
            System.out.println("게임을 켜져있습니다");
            System.out.println(isOn);
        } else {
            System.out.println(isOn);
            this.isOn = true;
            System.out.println("게임이 켜졌습니다");
            System.out.println(isOn);
        }
    }
    public void game() {
        if (isOn) {
            int[] arr = {};
            Random random = new Random();
            ArrayList<Integer> al = new ArrayList<>();
            int gotcha = random.nextInt(30) + 1;
            System.out.println("뽑은 캐릭터는 " + gotcha + "번 입니다!");
            money -= 500;

//            if(!Arrays.asList(arr).contains(gotcha)) {
//            } else {
//                al.add(gotcha);
//            }
//            System.out.println(al);
            System.out.println("남은 잔액 : " + money);
        } else if(money < 500){
            System.out.println("금액이 부족합니다.");
        } else {
            System.out.println("게임을 켜고 실행 해 주세요!");
        }
    }
    public void cList(){

    }
    public void turnOff(){
        if(!isOn){
            System.out.println("이미 게임이 꺼져있습니다");
        } else {
            System.out.println("게임을 끕니다");
            this.isOn = false;
        }
    }

}
