@java.lang.Override
public void onClick(android.view.View v) {
    children.priorSels[groupPosition] = childPosition;
    try {
        notifyItemChanged(groupPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
