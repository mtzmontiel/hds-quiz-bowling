package specs.bowling.puntos;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class PuntosSpareFixture {
    public String tiro(String tiro1, String tiro2) {
        return String.valueOf(Integer.valueOf(tiro1) + Integer.valueOf(tiro2));
    }
}
