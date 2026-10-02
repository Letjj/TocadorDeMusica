package contexto;

import estado.Estado;
import estados.EstadoPronto;

public class TocadorDeMusica {
    private Estado estadoAtual;

    public TocadorDeMusica() {
        // Estado inicial
        this.estadoAtual = new EstadoPronto();
    }

    public void setEstado(Estado estado) {
        this.estadoAtual = estado;
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void play() {
        estadoAtual.play(this);
    }

    public void pause() {
        estadoAtual.pause(this);
    }

    public void stop() {
        estadoAtual.stop(this);
    }

    public String getEstadoAtualNome() {
        return estadoAtual.getNomeEstado();
    }
}
