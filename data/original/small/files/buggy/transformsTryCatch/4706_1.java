@java.lang.Override
public void desenha(java.awt.Graphics g) {
    try {
        g.drawOval(x, x, largura, altura);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
