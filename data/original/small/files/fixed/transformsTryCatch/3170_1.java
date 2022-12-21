@java.lang.Override
public void act() {
    try {
        timber.log.Timber.d("categorySpinner selected %d", mCategorySpinner.getSelectedItemPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int position = mCategorySpinner.getSelectedItemPosition();
    onCategoryChosen(position);
}
