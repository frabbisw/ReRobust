private void privateConstructor() {
    mMatrix.set(getImageMatrix());
    super.setScaleType(ScaleType.MATRIX);
    try {
        super.setLongClickable(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setClickable(true);
}
