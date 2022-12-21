public static void addBoundsListener(final javafx.stage.Stage stage, final java.lang.Class<?> prefNode) {
    try {
        jgnash.uifx.util.StageUtils.addBoundsListener(stage, prefNode.getName().replace('.', '/'));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
