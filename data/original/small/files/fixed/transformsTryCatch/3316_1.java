@java.lang.Override
void update() {
    try {
        this.buffer.get(0).flip();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
