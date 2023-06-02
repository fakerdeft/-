import controllers.DiceGameController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Exceptions;

public class diceTests {
    private DiceGameController dg;
    private Exceptions exception;

    @BeforeEach
    public void setUp() {
        this.dg = new DiceGameController();
        this.exception = new Exceptions();
    }

    @DisplayName("처음 입력때 1~5범위 벗어난 정수 입력되면 예외 발생 테스트")
    @Test
    public void testInputException() {
        String str = "51";
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateNumber(str)
        );
    }

    @DisplayName("두 번째 입력때 1, 2가 아닌 정수 입력되면 예외 발생 테스트")
    @Test
    public void testInputException2() {
        String str = "51";
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateNumber2(str)
        );
    }

    @DisplayName("소수점 입력되면 예외 발생 테스트")
    @Test
    public void testInputException3() {
        String str = "5.1";
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateNumber(str)
        );
    }


    @DisplayName("음수 입력되면 예외 발생 테스트")
    @Test
    public void testInputException4() {
        String str = "-2";
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateNumber(str)
        );
    }

    @DisplayName("문자 입력되면 예외 발생 테스트")
    @Test
    public void testInputException5() {
        String str = "51";
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateNumber(str)
        );
    }

    @DisplayName("공백 입력되면 예외 발생 테스트")
    @Test
    public void testInputException6() {
        String str = " ";
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> exception.validateNumber(str)
        );
    }

}
