private static void updateTriggerIndicator(android.view.View trigger) {
    System.out.println("log");
    if ((com.ceco.lollipop.gravitybox.ModPieControls.mCenterTrigger) && (com.ceco.lollipop.gravitybox.ModPieControls.mTrigindEnabled)) {
        trigger.setVisibility(View.VISIBLE);
        trigger.setBackgroundColor(com.ceco.lollipop.gravitybox.ModPieControls.mTrigindColor);
    } else {
        trigger.setVisibility(View.GONE);
    }
}
