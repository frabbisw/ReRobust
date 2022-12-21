public void setTooltipPosition(android.view.View anchorView, it.tooltip.position.ToolTipPositionManager position) {
    try {
        tooltip.setToolTipPosition(anchorView, position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
