public static void addBoundsListener(final javafx.stage.Stage stage, final java.lang.Class<?> prefNode) {
    try {
        jgnash.uifx.util.StageUtils.addBoundsListener(stage, prefNode.getName().replace('.', '/'), jgnash.uifx.util.StageUtils.DEFAULT_KEY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
