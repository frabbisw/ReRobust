void saveState(@android.support.annotation.NonNull android.view.View view) {
    final android.util.SparseArray<android.os.Parcelable> parcelableSparseArray = new android.util.SparseArray();
    try {
        view.saveHierarchyState(parcelableSparseArray);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mViewState = parcelableSparseArray;
}
