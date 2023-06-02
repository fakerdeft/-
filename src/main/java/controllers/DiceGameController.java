package controllers;

import java.util.ArrayList;

import static utils.Constant.*;

public class DiceGameController {

    public void run() {
        do {
            tumbleDice(gameStart());
        } while (!selectGoStop().equals("end"));
    }


    public int gameStart() {
        String readLine;

        System.out.println("주사위를 굴릴 횟수를 입력하세요");
        do {
            System.out.println("1~5까지 정수만 입력하세요");
            readLine = SC.nextLine();
        } while (!readLine.equals(EXCEPTIONS.solveException(readLine)));
        return Integer.parseInt(readLine);
    }

    public void tumbleDice(int readLine) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < readLine; i++) {
            arr.add(i, RANDOM.nextInt(5) + 1);
        }
        System.out.println(arr);
    }

    public String selectGoStop() {
        String result;
        do {
            System.out.println("===============");
            System.out.println("1. 재시작 2. 종료");
            result = EXCEPTIONS.solveException2(SC.nextLine());
            System.out.println(result);
        } while (!result.equals("1") && !result.equals("2"));
        if (result.equals("1")) {
            return "restart";
        }
        return "end";
    }
}
