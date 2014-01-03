package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.EntradaEstandar;
import com.hds.arq.quizz.bowling.EntradaFactory;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaStrikeFixture {

    public int tirosDisponibles(int pinos) {
        final EntradaEstandar entrada = EntradaFactory.nuevaEntrada();
        entrada.tiro(pinos);
        return entrada.tirosDisponibles();
    }
}
