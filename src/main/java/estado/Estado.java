package estado;

import contexto.TocadorDeMusica;

public interface Estado {
    void play(TocadorDeMusica tocador);
    void pause(TocadorDeMusica tocador);
    void stop(TocadorDeMusica tocador);
    String getNomeEstado();
}