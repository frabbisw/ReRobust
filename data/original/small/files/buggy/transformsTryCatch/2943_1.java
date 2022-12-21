@java.lang.Override
public void stop() {
    WHS_planner.Main.mainPane.saveCalendar();
    new java.io.File((((WHS_planner.Main.SAVE_FOLDER) + (java.io.File.separator)) + "Keys/ipass.key")).delete();
    try {
        java.lang.System.exit(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
