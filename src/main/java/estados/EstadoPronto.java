package estados;

import contexto.TocadorDeMusica;
import estado.Estado;

public class EstadoPronto implements Estado {
    @Override
    public void play(TocadorDeMusica tocador) {
        System.out.println("Iniciando reprodução...");
        tocador.setEstado(new EstadoTocando());
    }

    @Override
    public void pause(TocadorDeMusica tocador) {
        System.out.println("Não é possível pausar, a música não está tocando.");
    }

    @Override
    public void stop(TocadorDeMusica tocador) {
        System.out.println("Já está parado.");
    }

    @Override
    public String getNomeEstado() { return "PRONTO"; }
}