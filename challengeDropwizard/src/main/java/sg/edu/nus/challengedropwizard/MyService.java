package sg.edu.nus.challengedropwizard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyService {
    public List<Double> computeMinCoinNumber(double targetAmount, List<Double> coinDenominations) {
        Collections.sort(coinDenominations, Collections.reverseOrder());
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < coinDenominations.size(); i++) {
            if (targetAmount >= coinDenominations.get(i)) {
                result.add(coinDenominations.get(i));
                targetAmount -= coinDenominations.get(i);
                targetAmount = Math.round(targetAmount * 100.0) / 100.0;
                i--;
            }
        }
        Collections.reverse(result);
        return result;
    }
}
