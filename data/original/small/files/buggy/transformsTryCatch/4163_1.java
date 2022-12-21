@java.lang.Override
public void setColor(java.lang.String color) {
    ClientModelRoot._instance.setColor(color);
    try {
        ClientModelRoot._instance.notifyAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
