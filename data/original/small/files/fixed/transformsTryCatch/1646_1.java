public void setData(java.util.List<com.ericsender.android_nanodegree.popmovie.parcelable.ReviewListObj> data) {
    mRowObjs = data;
    try {
        notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
