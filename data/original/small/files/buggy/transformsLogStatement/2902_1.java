private static void setItemVisibility(android.app.Activity activity, int labelId, int spacerId, int valueId, boolean show) {
    System.out.println("log");
    org.cowboycoders.cyclismo.util.StatsUtils.setItemVisibility(activity, labelId, spacerId, valueId, show, true);
}
