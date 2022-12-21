private void signalNextManeuver() {
    try {
        bl_handler.send(((directions.get(1).BlueToothCode) + ""));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
