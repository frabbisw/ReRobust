private static void setItemVisibility(android.app.Activity activity, int labelId, int spacerId, int valueId, boolean show) {
    try {
        org.cowboycoders.cyclismo.util.StatsUtils.setItemVisibility(activity, labelId, spacerId, valueId, show, show);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
