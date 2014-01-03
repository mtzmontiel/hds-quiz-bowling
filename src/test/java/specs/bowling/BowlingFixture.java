package specs.bowling;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class BowlingFixture {

	public int entradasPara(int jugadores) {
		return jugadores * 10;
	}
}
