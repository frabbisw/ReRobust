@java.lang.Override
public void onChanged() {
    removed = 0;
    mItemPositions.clear();
    try {
        super.onChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
