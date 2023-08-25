import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    void fibonacci_returnResult_for_n0 () {
        int n = 0;
        int actual = Calc.fibonnaci(n);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacci_returnResult_for_n1 () {
        int n = 1;
        int actual = Calc.fibonnaci(n);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
