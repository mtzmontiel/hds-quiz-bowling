package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.Entrada;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaSplitEntrada10Tiro3Fixture {

    public int tirosDisponibles(int primero, int segundo, int tercero) {
        final Entrada entrada = new Entrada();
        entrada.tiro(primero);
        entrada.tiro(segundo);
        entrada.tiro(tercero);
        return entrada.tirosDisponibles();
    }
}