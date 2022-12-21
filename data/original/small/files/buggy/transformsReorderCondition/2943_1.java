@java.lang.Override
public void stop() {
    WHS_planner.Main.mainPane.saveCalendar();
    new java.io.File(("Keys/ipass.key" + ((WHS_planner.Main.SAVE_FOLDER) + (java.io.File.separator)))).delete();
    java.lang.System.exit(0);
}
