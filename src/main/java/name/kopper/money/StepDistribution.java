package name.kopper.money;

import java.math.BigDecimal;

/**
 * Created by kopper on 13/11/15.
 */
public class StepDistribution {

    public final BigDecimal mu;
    public final BigDecimal sigma;

    public StepDistribution(BigDecimal mu, BigDecimal sigma) {
        this.mu = mu;
        this.sigma = sigma;
    }

    public RandomStep nextStep() {
        return new RandomStep(BigDecimal.ZERO);
    }

}
