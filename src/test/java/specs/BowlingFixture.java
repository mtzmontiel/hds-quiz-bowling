package specs;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class BowlingFixture {

	public int framesFor(int players) {
		return players * 10;
	}
}
