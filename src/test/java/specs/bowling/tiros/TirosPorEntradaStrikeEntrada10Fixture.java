package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.Entrada;
import com.hds.arq.quizz.bowling.EntradaFactory;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaStrikeEntrada10Fixture {

    public int tirosDisponibles(int primero) {
        final Entrada entrada = EntradaFactory.nuevaEntradaFinal();
        entrada.tiro(primero);
        return entrada.tirosDisponibles();
    }
}
