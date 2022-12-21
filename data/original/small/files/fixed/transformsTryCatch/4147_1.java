private static void updateTriggerIndicator(android.view.View trigger) {
    try {
        if ((com.ceco.lollipop.gravitybox.ModPieControls.mCenterTrigger) && (com.ceco.lollipop.gravitybox.ModPieControls.mTrigindEnabled)) {
            trigger.setBackgroundColor(com.ceco.lollipop.gravitybox.ModPieControls.mTrigindColor);
        } else {
            trigger.setBackgroundColor(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
