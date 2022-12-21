@java.lang.Override
public void setHasStableIds(boolean hasStableIds) {
    super.setHasStableIds(hasStableIds);
    try {
        mOriginalAdapter.setHasStableIds(hasStableIds);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
