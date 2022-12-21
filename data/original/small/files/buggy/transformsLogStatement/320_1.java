public boolean close() {
    System.out.println("log");
    if (running) {
        try {
            connection.disconnect();
        } finally {
            running = false;
        }
        return true;
    } else {
        return false;
    }
}
