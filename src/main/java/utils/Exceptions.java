package utils;

public class Exceptions {
    public Exceptions() {
    }

    public String solveException(String readLine) {// 첫 번째 입력 예외 처리 함수
        try {
            validateNumber(readLine);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return readLine;
    }

    public String solveException2(String readLine) {// 두 번째 입력 예외 처리 함수
        try {
            validateNumber2(readLine);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return readLine;
    }

    private void judgeNumber(String str) {// 정수인지 판단하는 함수
        if (!str.matches("[-+]?\\d*\\.?\\d+")) {
            throw new IllegalArgumentException("정수를 입력하세요");
        }
    }

    public void validateNumber(String readLine) {// 1~5 범위의 값인지 판단하는 함수
        this.judgeNumber(readLine);
        if (Integer.parseInt(readLine) > 5 || Integer.parseInt(readLine) < 1) {
            throw new IllegalArgumentException("1~5범위의 정수를 입력하세요");
        }
    }

    public void validateNumber2(String readLine) {// 1, 2 인지 판단하는 함수
        this.judgeNumber(readLine);
        if (Integer.parseInt(readLine) < 1 || Integer.parseInt(readLine) > 2) {
            throw new IllegalArgumentException("1과 2의 정수만 입력하세요");
        }
    }

}
