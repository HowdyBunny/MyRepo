package sg.edu.nus.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    public void testComputeMinCoinNumber() {
        List<Double> denominations = Arrays.asList(0.1, 0.5, 1.0, 5.0, 10.0);
        double targetAmount = 7.3;
        List<Double> expected = Arrays.asList(0.1, 0.1, 0.1, 1.0, 1.0, 5.0);
        List<Double> result = myService.computeMinCoinNumber(targetAmount, denominations);
        assertEquals(expected, result);
    }
}
