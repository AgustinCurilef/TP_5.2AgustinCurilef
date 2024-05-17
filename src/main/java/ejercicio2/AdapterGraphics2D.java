package ejercicio2;

import java.awt.*;

public class AdapterGraphics2D implements Panel{
    private Graphics2D g2d;

    public AdapterGraphics2D(Graphics2D g2d) {
        this.g2d = g2d;
    }

    @Override
    public void dibujarCirculo(int x, int y, int width, int height) {
        g2d.drawOval(x , y , width, height);
    }

    @Override
    public void dibujarLinea(int x1, int y1, int x2, int y2) {
        g2d.drawLine(x1, y1, x2 , y2);
    }

    @Override
    public void dibujarTexto(String str, int x, int y) {
        g2d.drawString(str,x, y);
    }
}
