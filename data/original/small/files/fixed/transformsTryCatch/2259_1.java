public void strafeLeft() {
    try {
        sendVels((-1), 2, 1, (-2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
