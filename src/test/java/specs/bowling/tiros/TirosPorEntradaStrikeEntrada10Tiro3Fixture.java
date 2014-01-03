package specs.bowling.tiros;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import com.hds.arq.quizz.bowling.EntradaEstandar;
import com.hds.arq.quizz.bowling.EntradaFactory;

@RunWith(ConcordionRunner.class)
public class TirosPorEntradaStrikeEntrada10Tiro3Fixture {

    public int tirosDisponibles(int primero, int segundo, int tercero) {
        final EntradaEstandar entrada = EntradaFactory.nuevaEntrada();
        entrada.tiro(primero);
        entrada.tiro(segundo);
        entrada.tiro(tercero);
        return entrada.tirosDisponibles();
    }
}
