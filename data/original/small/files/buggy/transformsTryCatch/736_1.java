@java.lang.Override
public void display(java.awt.Graphics g) {
    try {
        stackDisplay(g, top());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
