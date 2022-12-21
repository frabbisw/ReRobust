public void sleep() {
    System.out.println("log");
    try {
        java.lang.System.in.read();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
