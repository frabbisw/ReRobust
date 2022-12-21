@java.lang.Override
public void setHasStableIds(boolean hasStableIds) {
    super.setHasStableIds(hasStableIds);
    try {
        if ((mOriginalAdapter) != null)
            mOriginalAdapter.setHasStableIds(hasStableIds);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
