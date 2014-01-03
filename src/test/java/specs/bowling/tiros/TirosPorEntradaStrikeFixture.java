package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.Entrada;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaStrikeFixture {

    public int tirosDisponibles(int pinos) {
        final Entrada entrada = new Entrada();
        entrada.tiro(pinos);
        return entrada.tirosDisponibles();
    }
}
