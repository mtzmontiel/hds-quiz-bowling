package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.Entrada;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaFixture {

	public int tirosDisponibles() {
		return new Entrada().tirosDisponibles();
	}
}
