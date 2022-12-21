private void privateConstructor(android.content.Context context) {
    System.out.println("log");
    mMatrix.set(getImageMatrix());
    super.setScaleType(ScaleType.MATRIX);
    super.setLongClickable(false);
    setClickable(true);
}
