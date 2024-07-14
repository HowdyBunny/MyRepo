package sg.edu.nus.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoinController {
    @Autowired
    private MyService myService;
    @GetMapping("/getMinCoinNumber")
    public ResponseEntity<List<Double>> getMinCoinNumber(@RequestParam double targetAmount,
                                                         @RequestParam List<Double> coinDenominations){
        List<Double> res=myService.computeMinCoinNumber(targetAmount,coinDenominations);
        return ResponseEntity.ok(res);
    }
}
