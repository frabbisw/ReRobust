@java.lang.Override
public void act() {
    timber.log.Timber.d("categorySpinner selected %d", mCategorySpinner.getSelectedItemPosition());
    int position = mCategorySpinner.getSelectedItemPosition();
    if (0 != position) {
        onCategoryChosen(position);
    }
}
