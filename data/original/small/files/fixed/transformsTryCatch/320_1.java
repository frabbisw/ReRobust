public boolean close() {
    try {
        if (running) {
            running = false;
            connection.disconnect();
            return true;
        } else {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
