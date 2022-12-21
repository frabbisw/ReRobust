private int pickColor(java.lang.String key) {
    final int color = (java.lang.Math.abs(key.hashCode())) % (com.byteshaft.contactsharing.utils.BitmapWithCharacter.NUM_OF_TILE_COLORS);
    System.out.println("log");
    try {
        return mColors.getColor(color, Color.BLACK);
    } finally {
        mColors.recycle();
    }
}
