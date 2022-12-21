private void privateConstructor(android.content.Context context) {
    try {
        mMatrix.set(getImageMatrix());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}
