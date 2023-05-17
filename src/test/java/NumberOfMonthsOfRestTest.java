import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.NumberOfMonthsOfRest;

public class NumberOfMonthsOfRestTest {
    @Test

    public void testCaseNumberOne() {


        NumberOfMonthsOfRest servise = new NumberOfMonthsOfRest();
        int expected = 3;
        int actual = servise.calculate(10_000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testCaseNumberTwo() {
        NumberOfMonthsOfRest servise = new NumberOfMonthsOfRest();
        int expected = 2;
        int actual = servise.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }


}
