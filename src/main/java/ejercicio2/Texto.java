package ejercicio2;


import java.awt.*;

class Texto implements Figura {
    private final Coordenada coordenada;
    private String texto;

    public Texto(Coordenada coordenada, String texto) {
        this.texto = texto;
        this.coordenada = coordenada;
    }

    @Override
    public void dibujar(Panel panel) {
        panel.dibujarTexto(texto, coordenada.x(), coordenada.y());
    }
}