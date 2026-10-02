package estados;

import contexto.TocadorDeMusica;
import estado.Estado;

public class EstadoTocando implements Estado {
    @Override
    public void play(TocadorDeMusica tocador) {
        System.out.println("A música já está tocando.");
    }

    @Override
    public void pause(TocadorDeMusica tocador) {
        System.out.println("Pausando a música...");
        tocador.setEstado(new EstadoPausado());
    }

    @Override
    public void stop(TocadorDeMusica tocador) {
        System.out.println("Parando a música...");
        tocador.setEstado(new EstadoPronto());
    }

    @Override
    public String getNomeEstado() { return "TOCANDO"; }
}
