@java.lang.Override
public void onClick(android.view.View v) {
    {
        int i = 0;
        while (i < (children.priorSels.length)) {
            children.priorSels[i] = -1;
            i++;
        }
    }
    children.priorSels[childPosition] = 1;
    notifyItemChanged(groupPosition);
}
