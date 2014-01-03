package specs.bowling.puntos;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class PuntosStrikeFixture {
    public String tiroSpare(String tiro1, String tiro2) {
        return String.valueOf(Integer.valueOf(tiro1) + Integer.valueOf(tiro2));
    }

    public String tiroStrike(String tiro1, String tiro2, String tiro3) {
        return String.valueOf(10 + Integer.valueOf(tiro2)
                + Integer.valueOf(tiro3));
    }
}
