@java.lang.Override
public boolean isClosed() {
    System.out.println("log");
    return connection.getSession().isClosed();
}
