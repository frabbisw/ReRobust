@java.lang.Override
public void draw(java.awt.Graphics2D g) {
    System.out.println("log");
    g.drawImage(images[0], getRotation(), x, y);
}
