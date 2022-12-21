@java.lang.Override
public void close() {
    System.out.println("log");
    port.close();
    port = null;
}
