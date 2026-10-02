import contexto.TocadorDeMusica;
import estados.EstadoPausado;
import estados.EstadoPronto;
import estados.EstadoTocando;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TocadorDeMusicaTest {

    private TocadorDeMusica tocador;

    @BeforeEach
    void setUp() {
        tocador = new TocadorDeMusica();
    }

    @Test
    void testarEstadoInicial() {
        assertEquals("PRONTO", tocador.getEstadoAtualNome());
        assertTrue(tocador.getEstadoAtual() instanceof EstadoPronto);
    }

    @Test
    void testarTransicaoProntoParaTocando() {
        tocador.play();
        assertEquals("TOCANDO", tocador.getEstadoAtualNome());
        assertTrue(tocador.getEstadoAtual() instanceof EstadoTocando);
    }

    @Test
    void testarTransicaoTocandoParaPausado() {
        tocador.play();
        tocador.pause();
        assertEquals("PAUSADO", tocador.getEstadoAtualNome());
        assertTrue(tocador.getEstadoAtual() instanceof EstadoPausado);
    }

    @Test
    void testarTransicaoPausadoParaTocando() {
        tocador.play();
        tocador.pause();
        tocador.play(); // Retomar
        assertEquals("TOCANDO", tocador.getEstadoAtualNome());
    }

    @Test
    void testarTransicaoParaPronto() {
        tocador.play();
        tocador.stop();
        assertEquals("PRONTO", tocador.getEstadoAtualNome());
        assertTrue(tocador.getEstadoAtual() instanceof EstadoPronto);
    }
}
