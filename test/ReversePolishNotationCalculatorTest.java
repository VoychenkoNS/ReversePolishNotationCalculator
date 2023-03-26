import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReversePolishNotationCalculatorTest {

    private static ReversePolishNotationCalculator reversePolishNotationCalculator;

    @BeforeAll
    public static void init() {
        reversePolishNotationCalculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void canAdditionElement() {
        int res = reversePolishNotationCalculator.calculatePolishNotation("1 2 +");
        Assertions.assertEquals(res, 3);
    }

    @Test
    public void canSubtractionElement() {
        int res = reversePolishNotationCalculator.calculatePolishNotation("1 2 -");
        Assertions.assertEquals(res, -1);
    }

    @Test
    public void canMultiplicationElement() {
        int res = reversePolishNotationCalculator.calculatePolishNotation("3 2 *");
        Assertions.assertEquals(res, 6);
    }

    @Test
    public void checkMoreSpace() {
        int res = reversePolishNotationCalculator.calculatePolishNotation("2 2   *");
        Assertions.assertEquals(res, 4);

        res = reversePolishNotationCalculator.calculatePolishNotation("2   2 +");
        Assertions.assertEquals(res, 4);

        res = reversePolishNotationCalculator.calculatePolishNotation("2   2   -");
        Assertions.assertEquals(res, 0);
    }

}