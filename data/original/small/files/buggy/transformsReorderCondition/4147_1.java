private static void updateTriggerIndicator(android.view.View trigger) {
    if ((com.ceco.lollipop.gravitybox.ModPieControls.mTrigindEnabled) && (com.ceco.lollipop.gravitybox.ModPieControls.mCenterTrigger)) {
        trigger.setVisibility(View.VISIBLE);
        trigger.setBackgroundColor(com.ceco.lollipop.gravitybox.ModPieControls.mTrigindColor);
    } else {
        trigger.setVisibility(View.GONE);
    }
}
