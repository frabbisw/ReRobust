@java.lang.Override
public void setColor(java.lang.String color) {
    try {
        ClientModelRoot._instance.setColor(color);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
