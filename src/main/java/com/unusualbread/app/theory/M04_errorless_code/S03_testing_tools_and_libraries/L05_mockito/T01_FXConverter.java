package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L05_mockito;

import java.math.BigDecimal;
import java.math.RoundingMode;

class FXConverter {
    private final RemoteFXRateService remoteFXRateService;

    public FXConverter(RemoteFXRateService remoteFXRateService) {
        this.remoteFXRateService = remoteFXRateService;
    }

    public BigDecimal convert(String source, String target, String input) {
        try {
            String response = remoteFXRateService.getRate(source, target);
            BigDecimal rate = new BigDecimal(response);
            BigDecimal amount = new BigDecimal(input);

            return amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
        } catch (IllegalStateException | IllegalArgumentException ex) {
            return new BigDecimal("-1.00");
        }
    }
}

interface RemoteFXRateService {
    String getRate(String source, String target);
}
