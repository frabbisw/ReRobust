@java.lang.Override
public void onChanged() {
    removed = 0;
    try {
        mItemPositions.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
