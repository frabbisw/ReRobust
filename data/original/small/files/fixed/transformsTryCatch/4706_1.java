@java.lang.Override
public void desenha(java.awt.Graphics g) {
    try {
        g.drawOval(x, y, largura, altura);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
