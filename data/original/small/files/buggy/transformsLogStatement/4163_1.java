@java.lang.Override
public void setColor(java.lang.String color) {
    System.out.println("log");
    ClientModelRoot._instance.setColor(color);
    ClientModelRoot._instance.notifyAll();
}
