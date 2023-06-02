package utils;

public class Exceptions {
    public Exceptions() {
    }

    public String solveException(String readLine) {
        try {
            validateNumber(readLine);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return readLine;
    }

    public String solveException2(String readLine) {
        try {
            validateNumber2(readLine);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return readLine;
    }

    private void judgeNumber(String str) {
        if (!str.matches("[-+]?\\d*\\.?\\d+")) {
            throw new IllegalArgumentException("정수를 입력하세요");
        }
    }

    public void validateNumber(String readLine) {
        this.judgeNumber(readLine);
        if (Integer.parseInt(readLine) > 5 || Integer.parseInt(readLine) < 1) {
            throw new IllegalArgumentException("1~5범위의 정수를 입력하세요");
        }
    }

    public void validateNumber2(String readLine) {
        this.judgeNumber(readLine);
        if (Integer.parseInt(readLine) < 1 || Integer.parseInt(readLine) > 2) {
            throw new IllegalArgumentException("1과 2의 정수만 입력하세요");
        }
    }

}
