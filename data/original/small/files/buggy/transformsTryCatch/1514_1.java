@java.lang.Override
public void onUpperBoundValue(com.freedomotic.model.ds.Config params, boolean fireCommand) {
    boolean executed = executeCommand("set saturation", params);
    try {
        if (executed) {
            setSaturation(254);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
