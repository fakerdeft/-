public class Exceptions {
    public String validateInputNumber(String count) {
        if (!count.matches("[-+]?\\d*\\.?\\d+")
                || Integer.parseInt(count) > 5
                || Integer.parseInt(count) < 1) {
            throw new IllegalArgumentException("1~5범위의 정수를 입력하세요");
        }
        return count;
    }
}
