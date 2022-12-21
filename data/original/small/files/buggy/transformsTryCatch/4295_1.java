protected void interrupted() {
    try {
        end();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
