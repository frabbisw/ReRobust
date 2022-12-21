@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    try {
        if (dr != null) {
            invalidate();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
