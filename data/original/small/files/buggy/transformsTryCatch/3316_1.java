@java.lang.Override
void update() {
    this.buffer.get(0).flip();
    try {
        java.lang.System.out.println("flip");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
