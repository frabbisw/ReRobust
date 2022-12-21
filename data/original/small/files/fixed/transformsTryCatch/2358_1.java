public void signalNextManeuver() {
    try {
        if ((directions.size()) > 1)
            bl_handler.send(((directions.get(1).BlueToothCode) + ""));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
