@java.lang.Override
public void onClick(android.view.View v) {
    for (int i = 0; (children.priorSels.length) > i; i++) {
        children.priorSels[i] = -1;
    }
    children.priorSels[childPosition] = 1;
    notifyItemChanged(groupPosition);
}
