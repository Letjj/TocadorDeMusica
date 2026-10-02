package estados;

import contexto.TocadorDeMusica;
import estado.Estado;

public class EstadoPausado implements Estado {
    @Override
    public void play(TocadorDeMusica tocador) {
        System.out.println("Retomando a reprodução...");
        tocador.setEstado(new EstadoTocando());
    }

    @Override
    public void pause(TocadorDeMusica tocador) {
        System.out.println("A música já está pausada.");
    }

    @Override
    public void stop(TocadorDeMusica tocador) {
        System.out.println("Parando a música pausada...");
        tocador.setEstado(new EstadoPronto());
    }

    @Override
    public String getNomeEstado() { return "PAUSADO"; }
}