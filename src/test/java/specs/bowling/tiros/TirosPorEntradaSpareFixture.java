package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.Entrada;
import com.hds.arq.quizz.bowling.EntradaFactory;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaSpareFixture {

    public int tirosDisponibles(int pinos) {
        final Entrada entrada = EntradaFactory.nuevaEntrada();
        entrada.tiro(pinos);
        return entrada.tirosDisponibles();
    }
}
