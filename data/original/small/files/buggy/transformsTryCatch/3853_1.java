@java.lang.Override
public void newgame() throws java.io.IOException {
    try {
        out.writeByte('N');
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(((byte) ('N')));
}
