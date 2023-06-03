package controllers;

import java.util.ArrayList;

import static utils.Constant.*;

public class DiceGameController {

    public void run() {// 게임 실행 함수
        do {
            tumbleDice(inputCount());
        } while (!selectGoStop().equals("end"));
    }


    public int inputCount() {// 사용자가 원하는 횟수를 입력하는 함수
        String readLine;

        System.out.println("주사위를 굴릴 횟수를 입력하세요");
        do {
            System.out.println("1~5까지 정수만 입력하세요");
            readLine = SC.nextLine();
        } while (!readLine.equals(EXCEPTIONS.solveException(readLine)));
        return Integer.parseInt(readLine);
    }

    public void tumbleDice(int readLine) {// 주사위 굴리는 함수
        List<Integer> tumbleList = new ArrayList<>();
        for (int i = 0; i < readLine; i++) {
            tumbleList.add(i, RANDOM.nextInt(6) + 1);
        }
        System.out.println(tumbleList);
    }

    public String selectGoStop() {// 사용자가 재시작과 종료를 선택하는 함수
        String result;
        do {
            System.out.println("===============");
            System.out.println("1. 재시작 2. 종료");
            result = EXCEPTIONS.solveException2(SC.nextLine());
            System.out.println(result);
        } while (!result.equals(result));
        if (result.equals("1")) {
            return "restart";
        }
        return "end";
    }
}
