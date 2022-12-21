public static void main() {
    int a = 10;
    int b = 11;
    int c = org.tlsys.Main.get(1, 2);
    try {
        org.tlsys.Main.giveException();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return;
}
