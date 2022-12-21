private void signalNextManeuver() {
    System.out.println("log");
    bl_handler.send(((directions.get(1).BlueToothCode) + ""));
}
